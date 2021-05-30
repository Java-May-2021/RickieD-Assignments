package com.rickied.songs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rickied.songs.models.Song;
import com.rickied.songs.services.SongService;

@Controller
public class SongController {
	@Autowired
	private SongService songService;
	
	@GetMapping("/")
	public String index() {
		return "welcome.jsp";
	}
	
	//Go to all songs
	@GetMapping("/dashboard")
	public String dashboard(@ModelAttribute("Song") Song song, Model model) {
		List<Song> allSongs = songService.getAllSongs();
		model.addAttribute("allSongs", allSongs);
		return "dashboard.jsp";
	}
	
	@GetMapping("/song/add")
	public String addSong(@ModelAttribute("Song") Song song, Model model) {
		return "addSong.jsp";
	}
	
	@PostMapping(value="/create")
	public String createSong(@Valid @ModelAttribute("Song")Song song, Model model, BindingResult result) {

		if(result.hasErrors()) {
			return "addSong.jsp";
		}
		
		this.songService.createSong(song);
		System.out.println(song.getTitle() +" successfully created");
		
		return "redirect:/dashboard";
		
		}
	@GetMapping("/song/{id}")
	public String getSong(@PathVariable("id")Long id, Model model) {
		Song oneSong = this.songService.getSingleSong(id);
		model.addAttribute("song", oneSong);
			return "viewSong.jsp";
		
	}
	@GetMapping("/top10")
	public String getTopTen(Model model) {
		List<Song> topTenSongs = songService.findTopTen();
		model.addAttribute("topTenSongs", topTenSongs);
		return "topSongs.jsp";
	}
	
	@PostMapping("/search")
	public String searchArtist(@RequestParam("artist") String artist, Model model) {
		List<Song> oneArtist = songService.findByArtist(artist);
		model.addAttribute("oneArtist", oneArtist);
		model.addAttribute("artist", artist);
		return "search.jsp";
	}
	
	@GetMapping("/song/delete/{id}")
	public String deleteSong(@PathVariable("id")Long id) {
		this.songService.deleteSong(id);
		System.out.println("Song " + id + " has been deleted");
		return "redirect:/dashboard";
		
	}
}
