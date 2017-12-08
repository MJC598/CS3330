/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9converter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author mcarroll
 */
public class AboutController extends Switchable implements Initializable {

    @FXML
    private TextArea comments;
    @FXML
    private Button menu;
    @FXML
    private Button save;
    @FXML
    private Button open;
    
    private String filename = "comment.ser";
    CommentBox commentBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMenuAction(ActionEvent event) {
        Switchable.switchTo("Menu");
    }

    @FXML
    private void handleSaveAction(ActionEvent event) {
        commentBox = createCommentFromFormData();
        
        if(commentBox == null){
            return;
        }
        //Exception Handling, catching corrupted files or non-existant files
        try{
            
            FileOutputStream oFile = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(oFile);
            out.writeObject(commentBox);
            
            out.close();
            oFile.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private CommentBox createCommentFromFormData(){
        CommentBox cB = new CommentBox();
        cB.setComment(comments.getText());
        return cB;
    }

    @FXML
    private void handleOpen(ActionEvent event) {
        //another example of exception handling
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            
            commentBox = (CommentBox) in.readObject();
            
            in.close();
            file.close();
                
            fillFormFromComment(commentBox);
            
            //catching exceptions of corrupted files or non-existant files
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Look above for serialization functions
    
    private void fillFormFromComment(CommentBox commentBox){
        comments.setText(commentBox.getComment());
    }
    
}
