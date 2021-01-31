package lesson_1.classes.trails;

public class Jump extends Trail {

	public Jump(int trailDistance) {
		super(trailDistance);
		this.winNote = "Успешно перепрыгнул барьер;\n";
		this.looseNote = "Не смог перепрыгнуть барьер;\n";
	}
}
