package org.example.gumball;

import static org.junit.Assert.*;

import java.util.Collection;

import org.example.gumball.GumBall.Color;
import org.junit.Test;

public class GumballMachineTest {

	@Test
	public void test() {
		GumballMachine gumballMachine = new GumballMachine(10, 20, 30);

		Collection<GumBall> allGumballs = gumballMachine.getAllGumballs();

		assertEquals(20,
				allGumballs.stream().filter(g -> g.getColor() == Color.GREEN)
						.count());
	}
	
	@Test
	public void test2() {
		GumballMachine gumballMachine = new GumballMachine(10, 20, 30);

		Collection<GumBall> allGumballs = gumballMachine.getAllGumballs();

		assertEquals(50,
				allGumballs.stream().filter(g -> g.getColor() != Color.RED)
						.count());
	}
}
