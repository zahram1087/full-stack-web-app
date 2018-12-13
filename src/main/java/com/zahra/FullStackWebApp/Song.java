package com.zahra.FullStackWebApp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;

    @OneToMany
    public List<Album> album; //and the album on which that song appears

    public Song(){}

    public Song(String title, int length, int trackNumber){
        this.title=title;
        this.length= length;
        this.trackNumber=trackNumber;
    }

    public String toString(){
        return "Song: "+ title+"\n"+"trackNumber: "+ trackNumber+"\n"+"Album duration(seconds): "+ length+ "in this" + this.album;

    }


}
