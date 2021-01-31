package lesson_1.classes.trails;

public class Run extends Trail {
	public Run(int trailDistance) {
		super(trailDistance);
		this.winNote = "Успешно пробежал кросс;\n";
		this.looseNote = "Не смог пробежать кросс;\n";
	}
}
