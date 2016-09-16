package quiz1;

import java.util.Scanner;

public class quizmain {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("How many touchdowns were made during your career? ");
		double TD = enter.nextDouble();
		
		System.out.println("How many yard were gained during your career? ");
		double Y = enter.nextDouble();
		
		System.out.println("How any completed passes were completed over your career? ");
		double C = enter.nextDouble();
		
		System.out.println("How many passes were intercepted over your carrer? ");
		double I = enter.nextDouble();
		
		System.out.println("Lastly, how many attempted passes were made over your entire career? ");
		double A = enter.nextDouble();
		
		enter.close();
		
		double a = (TD/A)*20;
		
		if(a > 2.375)
		{
			a = 2.375;
		}
		else if (a < 0)
		{
			a = 0;
		}
		
		double b = (Y/A - 3)*0.25;
		
		if(b > 2.375)
		{
			b = 2.375;
		}
		else if(b < 0)
		{
			b = 0;
		}
		
		double c = (C/A - 0.3)*5;
		{
		if(c > 2.375)
		{
			c = 2.375;
		}
		else if(c < 0)
		{
			c = 0;
		}
		
		double d = (2.375- (I/A)*25);
		{
		if(d > 2.375)
		
		{
			d = 2.375;
		}
		else if(d < 0)
		{
			d = 0;
		}
	 	
		double Rating = (((a+b+c+d)/6)*100);
		System.out.print("Your Passer Rating is ");
		System.out.printf("%.2f", Rating);
		
	}
	}
	}
}
