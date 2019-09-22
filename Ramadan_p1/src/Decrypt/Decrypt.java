package Decrypt;

//public class Decrypt {
import java.util.Scanner;
public class Decrypt {
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int bigOne = scan.nextInt();
		
		int a = bigOne / 1000;
		
		a = ((a + 3) % 10);
		int b = ((bigOne % 1000) / 100);
		b = ((b + 3) % 10);
		int c = ((bigOne % 1000) % 100) / 10;
		c = ((c + 3) % 10);
		int d = ((bigOne % 1000) % 100) % 10;
		d = ((d + 3) % 10);
		
		int newOne = (1000 * c) + (100 * d) + (10 * a) + b;
		System.out.println(newOne);

	}
}