package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

	private Guitar guitar;

	@Before
	public void setUp() throws Exception {
		guitar = new Guitar("Taylor Big Baby Acoustic", 350.0, 439.0, 6);
	}

	@Test
	public void play() {
		assertEquals("Twang", guitar.play());
	}

	@Test
	public void gotName() {
		assertEquals("Taylor Big Baby Acoustic", guitar.getName());
	}

	@Test
	public void gotBuyPrice() {
		assertEquals(350.0, guitar.getBuyPrice(), 0.001);
	}

	@Test
	public void gotSellPrice() {
		assertEquals(439.0, guitar.getSellPrice(), 0.001);
	}

	@Test
	public void gotNumberStrings() {
		assertEquals(6, guitar.getNumberStrings(), 0.001);
	}


}