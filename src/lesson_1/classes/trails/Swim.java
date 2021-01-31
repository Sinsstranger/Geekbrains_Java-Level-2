package lesson_1.classes.trails;

public class Swim extends Trail {
	public Swim(int trailDistance) {
		super(trailDistance);
		this.winNote = "Успешно проплыл дистанцию;\n";
		this.looseNote = "Не смог проплыть дистанцию;\n";
	}
}
