package lesson_1.classes.trails;

import lesson_1.classes.Sportsman;

public abstract class Trail {
	protected int trailDistance;
	protected boolean isTrough;
	String winNote, looseNote;

	public Trail(int trailDistance) {
		this.trailDistance = trailDistance;
	}

	public boolean isTrough() {
		return isTrough;
	}

	public void doAction(int sportsmanMaxDistance, Sportsman sportsman) {
		if (sportsmanMaxDistance >= this.trailDistance) {
			sportsman.info += this.winNote;
			this.isTrough = true;
			return;
		}
		sportsman.info += this.looseNote;
		this.isTrough = false;
	}
}
