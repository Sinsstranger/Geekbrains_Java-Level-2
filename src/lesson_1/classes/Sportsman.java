package lesson_1.classes;

public class Sportsman {
	public String name, info;
	public int jumpMaxDistance, swimMaxDistance, runMaxDistance;
	public boolean isWinner;

	public Sportsman(String name, int jumpMaxDistance, int swimMaxDistance, int runMaxDistance) {
		this.name = name;
		this.info = "";
		this.jumpMaxDistance = jumpMaxDistance;
		this.swimMaxDistance = swimMaxDistance;
		this.runMaxDistance = runMaxDistance;
		this.isWinner = true;
	}
}
