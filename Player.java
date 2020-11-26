// Create a class called Player. (Details in Module 3 Assignment 3)

package cs520.hw4;

public class Player {
	private int number;
	private String name;
	private String position;
	private String year;
	
	public Player(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getYear() {
		return year;
	}

	public void setNumber(int playerNumber) {
		number = playerNumber;
	}
	
	public void setName(String playerName) {
		name = playerName;
	}
	
	public void setPosition(String pos) {
		position = pos;
	}
	
	public void setYear(String yearInCollege) {
		 year = yearInCollege;
	}
	
	public String toString() {
		return "#" + number + ": " + name + "(" + position + "," + year + ")";
	}
}