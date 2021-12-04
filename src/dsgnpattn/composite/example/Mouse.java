package dsgnpattn.composite.example;

public class Mouse extends Device{
	private int price;
	private int power;
	
	public Mouse(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getPower() {
		return this.power;
	}

}
