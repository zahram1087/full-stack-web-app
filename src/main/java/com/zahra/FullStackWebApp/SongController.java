package com.zahra.FullStackWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepo;

    @RequestMapping(value ="/songs", method=RequestMethod.GET)
    public String index(Model m){
        m.addAttribute("songs", songRepo.findAll());
        return "songs";
    }

    @RequestMapping(value="/songs", method=RequestMethod.POST)
    public RedirectView create(@RequestParam String title,
                               @RequestParam int length,
                               @RequestParam int trackNumber){
        Song newSong = new Song(title,length,trackNumber);
        songRepo.save(newSong);
        return new RedirectView("/songs");

    }

}
