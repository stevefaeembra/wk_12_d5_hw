package entities;

public class Guitar extends Instrument {

	int numberStrings;


	public Guitar(String name, double buyPrice, double sellPrice, int numberStrings) {
		super(name, buyPrice, sellPrice);
		this.numberStrings = numberStrings;
	}

	@Override
	public String play() {
		return "Twang";
	}

	public double getNumberStrings() {
		return numberStrings;
	}
}
