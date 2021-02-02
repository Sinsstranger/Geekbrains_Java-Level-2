package lesson_1.classes;

public class Participant {
	public String name;
	public int maxRunDistance;
	public int maxSwimDistance;
	public String info = "";
	public boolean isPassed;

	public Participant(String name, int maxRunDistance, int maxSwimDistance) {
		this.name = name;
		this.maxRunDistance = maxRunDistance;
		this.maxSwimDistance = maxSwimDistance;
	}
}
