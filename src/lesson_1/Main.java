package lesson_1;

import lesson_1.classes.Course;
import lesson_1.classes.Sportsman;
import lesson_1.classes.Team;

public class Main {
	public static void main(String[] args) {
		Team team = new Team("Stars", new Sportsman[]{
				  new Sportsman("Dave", 12, 500, 1000),
				  new Sportsman("Sol", 10, 440, 1000),
				  new Sportsman("Sam", 12, 500, 900),
				  new Sportsman("John", 11, 500, 1000)});
		Course course = new Course();
		course.doIt(team);
		team.showWinners();
//		team.showSportsmen(); // - все спортсмены
	}
}
