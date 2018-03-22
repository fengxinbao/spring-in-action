package com.feng.ch04.args;

import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Override
	public void playTrack(int track) {
		System.out.println("Playing track " + track + ": " + tracks.get(track));
	}

	// Setters and getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

}
