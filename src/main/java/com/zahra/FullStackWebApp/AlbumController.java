package com.zahra.FullStackWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;



@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @RequestMapping(value="/albums", method=RequestMethod.GET)
    public String index (Model m){
        //grab all the albums from the database

        //display them on a page
        m.addAttribute("albums ", albumRepo.findAll());
        return "albumIndex";
    }

    @RequestMapping(value="/albums",method=RequestMethod.POST)
    public RedirectView create(@RequestParam String title,
                               @RequestParam String artist,
                               @RequestParam int songCount,
                               @RequestParam int length,
                               @RequestParam String imageUrl){
        Album newAlbum = new Album(title,artist,songCount,length,imageUrl);
        albumRepo.save(newAlbum);
        return new  RedirectView("/albums");
    }

}
