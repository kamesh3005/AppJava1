package com.demo.day8;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Player>  playerList = new ArrayList<Player>();
		Player  player1 = new Player(123, "Tom");
		playerList.add(player1);
		playerList.add(new Player(101, "Dora"));
		playerList.add(new Player(107, "Jerry"));
		playerList.add(new Player(108, "Jack"));
		
		// userdefined class 
		Collections.sort(playerList);
		for (Player player : playerList) {
			System.out.println(player);
		}

		System.out.println("------------------");
		Collections.sort(playerList,new PlayerNameComparator());
		for (Player player : playerList) {
			System.out.println(player);
		}
 
	}

}
