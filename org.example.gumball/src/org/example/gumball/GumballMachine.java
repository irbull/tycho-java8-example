package org.example.gumball;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.example.gumball.GumBall.Color;

public class GumballMachine {

	private List<GumBall> gumballs = new ArrayList<>();

	public GumballMachine(int red, int green, int blue) {
		gumballs.addAll(create(Color.RED, red));
		gumballs.addAll(create(Color.GREEN, green));
		gumballs.addAll(create(Color.BLUE, blue));
		Collections.shuffle(gumballs);
	}

	public GumBall getNextGumball() {
		return gumballs.remove(0);
	}

	private List<GumBall> create(Color color, int size) {
		List<GumBall> result = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			result.add(new GumBall(color));
		}
		return result;
	}

	public Collection<GumBall> getAllGumballs() {
		return Collections.unmodifiableCollection(gumballs);
	}

}
