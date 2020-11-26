package cs520.hw4;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class TeamTest {
	private static String number;
	private static String name;
	private static String position;
	private static String year;

	public static Player createPlayer(String number, String name, String position, String year) {
		int num = Integer.parseInt(number);

		Player player = new Player(name);
		player.setNumber(num);
		player.setName(name);
		player.setPosition(position);
		player.setYear(year);		
		return player;

	}

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<Player>(10);

		try {
			File file = new File("D:\\FelixImportantSchoolDocuments\\1_BostonUniversityOnlineMastersOfDataManagement\\AllClasses\\CS520_O2InformationStructuresWithJava\\Assignments\\Module3\\src\\cs520\\hw3\\part2\\team.txt");
			Scanner scanner = new Scanner(file);
			int playerCount = 0;
			while (scanner.hasNextLine()) {
				String uniformNumber = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}
				playerCount++;
//				Object player1 = player;
//				Object player = TeamTest.createPlayer(uniformNumber, name, position, year);
				Object player = player;
				players.add(player);
			}

			String[] opponents = new String[] {"BC", "Northeastern", "Harvard", "MIT", "UMass"};

			for (int i = 0; i <= opponents.length; i++) {
				Game game = new Game();
				game.setTeamName("Terriers");
				game.setOpponentName(opponents);
				game.setDate(11, 25, 2020);
				game.setPlayers(players);
				game.simulateGame();
			}
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
