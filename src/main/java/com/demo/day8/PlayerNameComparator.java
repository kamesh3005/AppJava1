package com.demo.day8;

import java.util.Comparator;

public class PlayerNameComparator implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
 		return player1.getPlayerName().compareTo(player2.getPlayerName());
	}

}
