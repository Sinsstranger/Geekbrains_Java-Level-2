package lesson_1.classes.courses;

import lesson_1.classes.AbstractCourse;
import lesson_1.classes.Participant;

public class RunningRoad extends AbstractCourse {
	private int requiredDistance = 1000;
	private String passMessage = "Успешно пробежал дистанцию\n";
	private String failMessage = "Не смог пробежать дистанцию\n";

	@Override
	protected void doIt(Participant participant) {
		if (participant.maxRunDistance <= this.requiredDistance) {
			participant.info += passMessage;
			participant.isPassed = true;
		} else {
			participant.info += failMessage;
			participant.isPassed = false;
		}
	}
}
