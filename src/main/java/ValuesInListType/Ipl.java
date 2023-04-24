package ValuesInListType;

import java.util.List;

public class Ipl {
	
	private String teamname;
	private String color;
	private List<String> players;
	
	
	public Ipl(String teamname, String color, List<String> players) {
		super();
		this.teamname = teamname;
		this.color = color;
		this.players = players;
	}
	public String getTeamname() {
		return teamname;
	}

	public String getColor() {
		return color;
	}
	public List<String> getPlayers() {
		return players;
	}
	@Override
	public String toString() {
		return "Ipl [teamname=" + teamname + ", color=" + color + ", players=" + players + "]";
	}
	
	

}
