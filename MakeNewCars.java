import java.util.Scanner;
public class makeNewCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kboard = new Scanner(System.in);
		
		Car Ferrari = new Car(245000, 2015, "Red", "Ferrari");
		
		System.out.println("This car is a " + Ferrari.returnBrand() + ".");
		
		System.out.println("What do you want to know (price, color, year)?");
		String userinput  = kboard.nextLine();
		if (userinput == "color")
		{
			System.out.println(Ferrari.returnColor());
		}
		if (userinput == "price")
		{
			System.out.println(Ferrari.returnBrand());
		}
		else if (userinput == "year")
		{
			System.out.println(Ferrari.returnYear());
		}
		
		System.out.println(Ferrari.returnYear());

	}

}
