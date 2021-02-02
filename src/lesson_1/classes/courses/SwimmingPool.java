package lesson_1.classes.courses;

import lesson_1.classes.AbstractCourse;
import lesson_1.classes.Participant;

public class SwimmingPool extends AbstractCourse {
	private int requiredDistance = 50;
	private String passMessage = "Успешно проплыл бассейн\n";
	private String failMessage = "Не смог проплыть бассейн\n";

	@Override
	protected void doIt(Participant participant) {
		if (participant.maxSwimDistance >= this.requiredDistance) {
			participant.info += passMessage;
			participant.isPassed = true;
		} else {
			participant.info += failMessage;
			participant.isPassed = false;
		}
	}
}
