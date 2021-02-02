package lesson_1.classes;

import lesson_1.interfaces.Course;

public abstract class AbstractCourse implements Course {

	@Override
	public void doIt(Team team) {
		for (Participant participant : team.getParticipants()
		) {
			doIt(participant);
		}
	}

	protected abstract void doIt(Participant participant);
}
