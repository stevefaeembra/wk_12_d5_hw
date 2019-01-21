package entities;

public class SheetMusic extends Item{

	private final String artist;
	private final String piece;

	public SheetMusic(String name, double buyPrice, double sellPrice, String artist, String piece) {
		super(name, buyPrice, sellPrice);
		this.artist = artist;
		this.piece = piece;
	}

}
