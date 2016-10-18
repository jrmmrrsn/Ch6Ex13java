//BarChart.java
//Chapter 6, Exercise 13
//Jeremy Morrison
//the java program prompts a user to enter the scores
//of five players and prints a bar chart consisting of stars

import java.util.Scanner;		//import the java utility, scanner

public class BarChart			//public class barchart
{						//opening barchart class bracket

	public static void main(String[] args)	//main method

	{								//opening main method bracket
		//create an instance of scanner class
		Scanner scanner=new Scanner(System.in);
		//declare integer variables to score for students
		int artScore=0;
		int bobScore=0;
		int calScore=0;
		int danScore=0;
		int eliScore=0;
		
		//print my name
		System.out.println("Jeremy Morrison\n");
		
		//prompt for first player
		System.out.print("Enter points scored by Art >> ");
		artScore=scanner.nextInt();				//store input to variable artscore

		//prompt for second player
		System.out.print("Enter points scored by Bob >> ");
		bobScore=scanner.nextInt();				//store input to variable bobscore

		//prompt for third player
		System.out.print("Enter points scored by Cal >> ");
		calScore=scanner.nextInt();				//store input to variable calscore
	
		//prompt for fourth player
		System.out.print("Enter points scored by Dan >> ");
		danScore=scanner.nextInt();				//store input to variable danscore

		//prompt for fifth player
		System.out.print("Enter points scored by Eli >> ");
		eliScore=scanner.nextInt();				//store input to variable eliscore
		
		System.out.println("\nPoints for Game\n");		//display points for game

		System.out.print("Art\t");				//display art and a tab
		drawChart(artScore);					//call the drawchart method to run a loop and display arts score with stars
	
		System.out.print("Bob\t");				//display bob and a tab
		drawChart(bobScore);					//call the drawchart method to run a loop and display bobs score with stars

		System.out.print("Cal\t");				//display cal and a tab
		drawChart(calScore);					//call the drawchart method to run a loop and display cals score with stars

		System.out.print("Dan\t");				//display dan and a tab
		drawChart(danScore);					//call the drawchart method to run a loop and display dans score with stars

		System.out.print("Eli\t");				//display eli and a tab
		drawChart(eliScore);					//call the drawchart method to run a loop and display elis score with stars
	
	}								//end main method
	public static void drawChart(int player)			//public drawchart method
	{								//opening bracket
		for(int index=0; index < player; index++)		//for loop setting int index variable to zero, if index is less than imported player score, add 1 to index, print and repeat
			System.out.print("*");				//display 1 x
			System.out.println();				//prints loop on 1 line
	}								//close drawchart method bracket
}									//close barchart class bracket
\*
Microsoft Windows [Version 6.3.9600]
(c) 2013 Microsoft Corporation. All rights reserved.

C:\Users\jeremy>cd\

C:\>cd solution\java

C:\solution\java>javac BarChart.java

C:\solution\java>java BarChart
Jeremy Morrison

Enter points scored by Art >> 6
Enter points scored by Bob >> 12
Enter points scored by Cal >> 8
Enter points scored by Dan >> 2
Enter points scored by Eli >> 20

Points for Game

Art     ******
Bob     ************
Cal     ********
Dan     **
Eli     ********************

C:\solution\java>
*\										