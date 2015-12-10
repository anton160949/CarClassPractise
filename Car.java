
public class Car {
	private int price;
	private int year;
	private String color;
	private String brand;
	
	public Car(int p, int y, String c, String b)
	{
		price = p;
		year = y;
		color = c;
		brand = b;
	}
	
	public int returnPrice()
	{
		return price;
	}
	
	public int returnYear()
	{
		return year;
	}
	
	public String returnColor()
	{
		return color;
	}
	
	public String returnBrand()
	{
		return brand;
	}

}
