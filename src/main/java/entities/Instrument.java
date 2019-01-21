package entities;

import behaviours.IPlay;

public abstract class Instrument extends Item implements IPlay {
	public Instrument(String name, double buyPrice, double sellPrice) {
		super(name, buyPrice, sellPrice);
	}
}
