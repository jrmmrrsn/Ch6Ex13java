# Ch6Ex13java
JavaProgramminCh6Ex13
//the java program that prompts user to enter the scores
//of five players and prints a bar char consists of stars

import java.util.Scanner;

public class BarChart
{

	public static void main(String[] args)

	{
		//create an instance of scanner class
		Scanner scanner=new Scanner(System.in);
		//declare integer variables to score for students
		int artScore=0;
		int bobScore=0;
		int calScore=0;
		int danScore=0;
		int eliScore=0;
		int index;  //index variable
		
		//prompt for first player
		System.out.print("Enter points scored by Art>>");
		artScore=scanner.nextint();

		System.out.print("Enter points scored by Bob>>")
		bobScore=scanner.nextint();

		System.out.print("Enter points scored by Cal>>")
		calScore=scanner.nextint();
	
		System.out.print("Enter points scored by Dan>>")
		danScore=scanner.nextint();

		System.out.print("Enter points scored by Eli>>")
		eliScore=scanner.nextint();

		System.out.println("Points for Game\n");

		System.out.print("Art\t");

		for(index=0; index < artScore; index++)
			System.out.print("*");

			System.out.println();

			System.out.println("Bob\t")

		for(index=0; index < bobScore; index++)

			System.out.println("*");

			System.out.println();

			System.out.print("Cal\t");

		for(index=0; index < calScore; index++)

			System.out.print("*");

			System.out.println();

			System.out.print("Dan\t");

		for(index=0; index < danScore; index++)
		
			System.out.print("*");

			System.out.println();

			System.out.print("Eli\t");
	
		for(index=0; index < eliScore; index++)

			System.out.print("*");

			System.out.println();

	}
}
