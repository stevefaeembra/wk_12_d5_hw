package entities;

public class Keyboard extends Instrument  {

	private boolean isTouchSensitive;
	private int numberKeys;

	public boolean isTouchSensitive() {
		return isTouchSensitive;
	}

	public int getNumberKeys() {
		return numberKeys;
	}

	public Keyboard(String name, double buyPrice, double sellPrice, boolean isTouchSensitive, int numberKeys) {
		super(name, buyPrice, sellPrice);
		this.isTouchSensitive = isTouchSensitive;
		this.numberKeys = numberKeys;
	}

	@Override
	public String play() {
		return "Tinkle Tinkle";
	}
}
