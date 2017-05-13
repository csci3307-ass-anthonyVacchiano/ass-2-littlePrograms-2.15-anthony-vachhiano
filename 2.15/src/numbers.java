import java.util.Scanner;
public class numbers {
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int add;
		int div;
		int mult;
		int sub;
		
		System.out.print("enter num1: ");
		num1 = input.nextInt();
		
		System.out.print("enter num2: ");
		num2= input.nextInt();
		
		add = num1 + num2;
		div = num1 / num2;
		mult = num1 * num2;
		sub = num1 - num2;
		
		System.out.printf("num1 + num2 is %d%n", add);
		System.out.printf("num1 / num2 is %d%n", div);
		System.out.printf("num1 * num2 is %d%n", mult);
		System.out.printf("num1 - num2 is %d%n", sub);
	}
}
