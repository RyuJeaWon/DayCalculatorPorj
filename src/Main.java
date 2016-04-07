import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year : ");
		int year =sc.nextInt();
		System.out.println("Enter month : ");
		int month =sc.nextInt();
		System.out.println("Enter day : ");
		int day =sc.nextInt();
		
		DayCalculator dayCalculator = new DayCalculator();
		System.out.println(dayCalculator.getday(year ,month , day));
	}

}
