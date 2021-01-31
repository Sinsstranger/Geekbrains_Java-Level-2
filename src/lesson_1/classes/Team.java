package lesson_1.classes;

public class Team {
	public String name;
	public Sportsman[] sportsmen;

	public Team(String name, Sportsman[] sportsmen) {
		this.name = name;
		this.sportsmen = sportsmen;
	}

	public void showWinners() {
		for (Sportsman sportsman : sportsmen) {
			if (sportsman.isWinner) {
				System.out.printf("####################%nИмя: %16s%nИнформация:%n%s####################", sportsman.name, sportsman.info);
			}
		}
	}

	public void showSportsmen() {
		for (Sportsman sportsman : sportsmen) {
			System.out.printf("####################%nИмя: %16s%nИнформация:%n%s", sportsman.name, sportsman.info);
		}
	}
}
