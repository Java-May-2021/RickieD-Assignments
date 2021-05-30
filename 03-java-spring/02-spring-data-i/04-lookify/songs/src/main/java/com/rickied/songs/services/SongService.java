package com.rickied.songs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rickied.songs.models.Song;
import com.rickied.songs.repositories.SongRepository;

@Service
public class SongService {
			//Dependency injection
			
			// adding the song repository as a dependency
		  	private SongRepository songRepo;
		    
		    public SongService(SongRepository repo) {
		        this.songRepo = repo;
		    }
		    // returns all the songs
		    public List<Song> getAllSongs() {
		        return this.songRepo.findAll();
		    }
		    
		    // creates a song
		    public Song createSong(Song newSong) {
		        return songRepo.save(newSong);
		    }
		   
		    public Song getSingleSong(Long id) {
				return this.songRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
			}
		    
		    //Update a song
		    public Song updateSong(Song updatedSong) {
		    	return this.songRepo.save(updatedSong);
		    }

			public void deleteSong(Long id) {
		        this.songRepo.deleteById(id);
		        
		    }
			
			//Search for songs by artist name
			public List<Song> findByArtist(String artist) {
				return this.songRepo.findByArtistContaining(artist);
			}
			
			//View top 10 songs
			public List<Song> findTopTen() {
				return this.songRepo.findTop10ByOrderByRatingDesc();
			}
}
