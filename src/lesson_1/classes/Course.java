package lesson_1.classes;

import lesson_1.classes.trails.Jump;
import lesson_1.classes.trails.Run;
import lesson_1.classes.trails.Swim;
import lesson_1.classes.trails.Trail;

public class Course {
	private Trail[] trails = {new Run(1000), new Jump(12), new Swim(450)};

	public void doIt(Team team) {
		for (Sportsman teamSportsman : team.sportsmen) {
			for (Trail trail : this.trails) {
				if (trail instanceof Jump) {
					trail.doAction(teamSportsman.jumpMaxDistance, teamSportsman);
				} else if (trail instanceof Run) {
					trail.doAction(teamSportsman.runMaxDistance, teamSportsman);
				} else if (trail instanceof Swim) {
					trail.doAction(teamSportsman.swimMaxDistance, teamSportsman);
				}
				teamSportsman.isWinner = teamSportsman.isWinner && trail.isTrough();
			}
		}
	}
}
