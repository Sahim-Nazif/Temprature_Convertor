import java.util.Scanner;
public class TempratureConvertor {

	public static void main(String[] args) {
	
	System.out.println("Welcome to Temprature Conversion Calculator");
	System.out.println("------------------------------------------");
	Scanner input=new Scanner(System.in);
	
	//Boolean to keep going until True;
	while (true) {
		System.out.println("\n Enter Your choice from our (F for Farenheit)(C for Celsius)(exit to Quit)");
		String temp=input.nextLine();
		if (temp.equalsIgnoreCase("f")) {
			System.out.println("Enter Temprature in Fareheit :");
			double f=input.nextDouble();
			double c=(f-32)*5/9;
			System.out.println("\n\the Temprature in celsius is :" +c);
		}
		else if (temp.equalsIgnoreCase("c")) {
			System.out.println("Enter Temprature in Celsius :");
			double c=input.nextDouble();
			double f=(c *9/5)+32;
			System.out.println("\nThe Temprature in Farenheit is :" + f);
		}
		else if (temp.equalsIgnoreCase("exit")) {
			
			System.out.println("Thank you for using the application ");
			break;
		}
		else {
			System.out.println("Invalid Entry !");
		}
	}
   }

}
