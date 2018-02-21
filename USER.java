import java.util.Scanner;
public class USER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many times do you want to make a rectangle?");
Scanner times = new Scanner(System.in);
int love = times.nextInt();
System.out.println("You want to make " + love + " rectangles.");
		int i;
		for(i=1; i<=love; i++) {
		
Scanner number = new Scanner(System.in);
System.out.println("Put in numbers for length and width");
int length = number.nextInt();
System.out.println("Your length is " + length);
int width = number.nextInt();
System.out.println("Your width is " + width);

RECTANGLE user = new RECTANGLE(length, width);
System.out.println(user.getArea() + " is your area and " + user.getPerameter() + " is your perameter for your rectangle." );
	}

}
}