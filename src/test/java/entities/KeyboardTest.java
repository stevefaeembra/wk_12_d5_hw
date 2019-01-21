package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

	private Keyboard piano;

	@Before
	public void setUp() {
		piano = new Keyboard("Baby Grand", 1400.00, 1500.00, true, 88);
	}

	@Test
	public void isTouchSensitive() {
		assertEquals(false, piano.isTouchSensitive());
	}

	@Test
	public void getNumberKeys() {
		assertEquals(89, piano.getNumberKeys());
	}

	@Test
	public void play() {
		assertEquals("Twing", piano.play());
	}

	@Test
	public void getBuyPrice() {
		assertEquals(200.0, piano.getBuyPrice(), 0.001);
	}

	@Test
	public void getSellPrice() {
		assertEquals(300.0, piano.getSellPrice(), 0.001);
	}

	@Test
	public void getName() {
		assertEquals("Booo", piano.getName());
	}

	@Test
	public void setSellPrice() {
	}

	@Test
	public void calculateMarkup() {
	}
}