package entities;

public class Amp extends Item{

	private String maker;
	private int goesUpTo;


	public Amp(String name, double buyPrice, double sellPrice, String maker, int goesUpTo) {
		super(name, buyPrice, sellPrice);
		this.maker = maker;
		this.goesUpTo = goesUpTo;
	}
}
