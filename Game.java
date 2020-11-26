package cs520.hw4;

import java.util.ArrayList;

public class Game {
	int month;
	int day;
	int year;
	String teamName;
	String opponentName;
	ArrayList<Player> players = new ArrayList<>(10);

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getOpponentName() {
		return opponentName;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setYear(int y) {
		year = y;
	}
	
	public void setTeamName(String nameOfTeam) {
		teamName = nameOfTeam;
	}
	
	public void setOpponentName(String oppName) {
		opponentName = oppName;
	}

	public void setPlayers(ArrayList<Player> Players) {
		players = Players;
	}

	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void simulateGame() {
		System.out.print("Game played on " + month + "/" + day + "/" + year + " vs. " + opponentName);
		int teamPoints = 0;

//		while (this.getPlayers()) {
//			int points = (int) (Math.random() * 10 + 1);
//			points += teamPoints;
//			System.out.print(players.toString() + "scored " + points + " points" + "\n");
//		}
		for (int i = 0; i <= 10; i++) {
			this.getPlayers();
			int points = (int) (Math.random() * 10 + 1);
			points += teamPoints;
			System.out.print("\n" + players + "scored " + points + " points" + "\n");
		}
		
		int opponentPoints = (int) (Math.random() * 100 + 1);

		System.out.print("\nFinal score: " + teamName + " " +  teamPoints + ", " + opponentName + " " + opponentPoints);
		System.out.println();
	}
}
