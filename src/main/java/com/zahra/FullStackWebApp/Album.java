package com.zahra.FullStackWebApp;

import javax.persistence.*;

@Entity
//@Table(name ="album")
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public String artist;
    public int songCount; //number of songs in album
    public int length; //in seconds of song?
    public String imageUrl;

    public Album() {}

    //constructor
    public Album(String title,String artist,int songCount,int length,String imageUrl){
        this.title= title;
        this.artist= artist;
        this.songCount = songCount;
        this.length= length;
        this.imageUrl=imageUrl;
    }


    public String toString(){
        return "Artist: "+ artist+"\n"+"Album Name: "+ title+"\n"+"Number of Songs: "+ songCount+"\n"+"Album duration(seconds): "+ length+"\n" + "Album Link: "+ imageUrl;
    }
}
