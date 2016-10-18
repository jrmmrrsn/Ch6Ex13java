//the java program that prompts user to enter the scores
//of five players and prints a bar char consists of stars
//this compiles and runs but i need the method drawChart
//that accepts the players name and points and contains a loop
//that prints the chart for each player that is passed to it.
//the program must get input from the keyboard
//the players names must be hard coded in the code

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
		artScore=scanner.nextInt();

		System.out.print("Enter points scored by Bob>>");
		bobScore=scanner.nextInt();

		System.out.print("Enter points scored by Cal>>");
		calScore=scanner.nextInt();
	
		System.out.print("Enter points scored by Dan>>");
		danScore=scanner.nextInt();

		System.out.print("Enter points scored by Eli>>");
		eliScore=scanner.nextInt();

		System.out.println("Points for Game\n");

		System.out.print("Art\t");

		for(index=0; index < artScore; index++)
			System.out.print("*");

			System.out.println();

			System.out.print("Bob\t");

		for(index=0; index < bobScore; index++)

			System.out.print("*");

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
		
