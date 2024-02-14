package com.demo.day8;

public class Player implements  Comparable<Player> {
	
	private int playerId;
	private String playerName;
	
	 public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-25s", playerId,playerName);
	}

	@Override
	public int compareTo(Player p1) {
		int result=0;
		if (playerId < p1.playerId) {
			result =-1 ;
		}else if (playerId > p1.playerId) {
			result=1;
		}
		
 		return result;
	}
	 

}
