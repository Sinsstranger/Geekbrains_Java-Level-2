package lesson_1;

import lesson_1.classes.Participant;
import lesson_1.classes.Team;
import lesson_1.classes.courses.RunningRoad;
import lesson_1.classes.courses.SwimmingPool;
import lesson_1.interfaces.Course;

public class Main {
	public static void main(String[] args) {
		Team team = new Team(
				  "Lazy Boys",
				  new Participant("Mikle", 1000, 50),
				  new Participant("Sam", 100, 49)
		);
		Course[] courses = {new RunningRoad(), new SwimmingPool()};
		for (Course course : courses) {
			course.doIt(team);
		}
//		team.showPassedParticipants();
		team.showAllParticipants();
	}
}
