package com.Question01;

import java.util.Scanner;

//Author is sejal
//Code to display HighestPlacements

public class HighestPlacements {
	
	public static void main(String[]args)
	{
	int Cse, It, Mech;
	Scanner sc= new Scanner(System.in);
	Cse = sc.nextInt();
	It= sc.nextInt();
	Mech=sc.nextInt();
	if(Cse>It && Cse>Mech)
	{System.out.println("Cse has the Highest Placements");
	}
	else if(It>Cse && It>Mech)
	{System.out.println("Mech has the Highest Placements");
	}
	else
	{System.out.println("Mech has the Highest Placements");
	}
  }
}