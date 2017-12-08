/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9converter;

import java.io.Serializable;
import javafx.scene.control.TextField;

/**
 *
 * @author mcarroll
 */
public class CommentBox implements Serializable{
//    private TextField comment;
    private String toSave;
    public CommentBox(){
        
    }
    
    public CommentBox(String comment){
        this.toSave = comment;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return toSave;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String toSave) {
        this.toSave = toSave;
    }
}
