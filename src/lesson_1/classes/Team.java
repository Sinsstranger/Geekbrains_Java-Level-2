package lesson_1.classes;

public class Team {
	private String name;

	public Participant[] getParticipants() {
		return participants;
	}

	private Participant[] participants;

	public Team(String name, Participant... participants) {
		this.name = name;
		this.participants = participants;
	}

	public void showAllParticipants() {
		System.out.println("Комманда: " + this.name);
		for (Participant participant : this.participants) {
			System.out.println("##########\n" +
					  "Имя: " + participant.name + "\n" +
					  "Информация: " + participant.info
			);
		}
	}

	public void showPassedParticipants() {
		System.out.println("Комманда: " + this.name);
		for (Participant participant : this.participants) {
			if (participant.isPassed) {
				System.out.println("##########\n" +
						  "Имя: " + participant.name + "\n" +
						  "Информация: " + participant.info
				);
			}
		}
	}
}
