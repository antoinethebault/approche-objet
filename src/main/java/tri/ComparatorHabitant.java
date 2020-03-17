package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getNbHabitants()-o2.getNbHabitants()>0)
			return 1;
		else if (o1.getNbHabitants()-o2.getNbHabitants()<0)
			return -1;
		else
			return 0;
	}

}
