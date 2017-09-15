/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjc6r9movies;

/**
 *
 * @author mcarroll
 */
public class Movie {
    
    private String name;
    private String director;
    private String summary;
    private float rating;
    private int version;
    
    public Movie(String name, String director){
        this.name = name;
        this.director = director;
        version = 0;
    }
    
    public Movie(String name, String director, String summary){
        this.name = name;
        this.director = director;
        this.summary = summary;
        version = 1;
    }
    public void setName(String name){
        this.name = name;
        version++;
    } 
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setSummary(String summary){
        this.summary = summary;
        version++;
    }
    
    public void setRating(float rating){
        this.rating = rating;
        version++;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDirector(){
        return director;
    }
    
    public String getSummary(){
        return summary;
    }
    
    public float getRating(){
        return rating;
    }
    
    public int getVersion(){
        return version;
    }
}
