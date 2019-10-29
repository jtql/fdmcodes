package com.fdmgroup.SerializationEx;

public class Board {
	public void attack(Player player1, Player player2) throws InterruptedException {
		System.out.println(player1.getName() + " attacks " + player2.getName());
		defend(player1, player2);
	}

	public void defend(Player player1, Player player2) {
		double chance = Math.random();
		if (chance > 0.5) {
			System.out.println("Attack Success");
			loseHealthPoint(player2);
			System.out.println(player2.getName() + " " + player2.getHealthPoints());
		} else {
			System.out.println("Attack Failed.");
			System.out.println(player2.getName() + " " + player2.getHealthPoints());
		}

	}

	public void loseHealthPoint(Player player) {
		player.setHealthPoints(player.getHealthPoints() - 100);
	}
}
