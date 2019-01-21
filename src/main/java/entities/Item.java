package entities;

import behaviours.ISell;

public abstract class Item implements ISell {

	double buyPrice;
	double sellPrice;
	String name;

	public double getBuyPrice() {
		return buyPrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public String getName() {
		return name;
	}

	public Item(String name, double buyPrice, double sellPrice) {
		this.name = name;
		this.buyPrice = buyPrice; // price shop paid for it
		this.sellPrice = sellPrice; // price customer will pay for it.
	};

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	};

	@Override
	public double calculateMarkup(double buyPrice, double sellPrice) {
		// returns markup as a percentage e.g. buy for £10, sell for £15
		// should return 50% ((15-10)/10)*100 = 50
		return ((sellPrice-buyPrice) / buyPrice)*100;
	}
}
