/******************************************************
 * File: 		DrunkardTester.java
 * Author: 		Jiaxin Ye
 * USC LoginID: jiaxinye
 * Course: 		CS 455 PA1 Fall 2013
 * 
 * Description: This program is designed to test the
 * 				drunkard class.
 * 
 *****************************************************/

import java.awt.geom.Point2D;

public class DrunkardTester {
	public static void main (String[] arg){
			System.out.println("DrunkardTester is a testing program for testing Drunkard");
			System.out.println("-----------------------------Start Tesing---------------------------------");
			System.out.println("-------------------------Testing Consturctor------------------------------");
			System.out.println("...Creating drunkard 1,2 and 3 with initial point(200,200), (100,100) and (400,10) \n with stepsize 1, 2 and 30");
			
			Drunkard drunkard1 = new Drunkard(new ImPoint(200,200),1);
			Drunkard drunkard2 = new Drunkard(new ImPoint(100,100),2);
			Drunkard drunkard3 = new Drunkard(new ImPoint(400,10),30);
			System.out.println("...Object created \n ");
			
			System.out.println("--------------------Testing getCurrentLoc() function------------------------");
			System.out.println("...Drunkard1 location:");
			System.out.println("Point Loc: " + "(" + drunkard1.getCurrentLoc().getX() + "," + drunkard1.getCurrentLoc().getY() + ")");
			System.out.println("...expected location: (200,200)");
			System.out.println("...Drunkard2 location:");
			System.out.println("Point Loc: " + "(" + drunkard2.getCurrentLoc().getX() + "," + drunkard2.getCurrentLoc().getY() + ")");
			System.out.println("...expected location: (100,100)");
			System.out.println("...Drunkard3 location:");
			System.out.println("Point Loc: " + "(" + drunkard3.getCurrentLoc().getX() + "," + drunkard3.getCurrentLoc().getY() + ")");
			System.out.println("...expected location: (400,10) \n ");
			
			System.out.println("------------------------Testing takeStep() function-------------------------");
			System.out.println("...Drunkard1 location:");
			System.out.println("Point Loc: " + "(" + drunkard1.getCurrentLoc().getX() + "," + drunkard1.getCurrentLoc().getY() + ")");
			System.out.println("...takeStep();");
			drunkard1.takeStep();
			System.out.println("...Drunkard1 location:");
			System.out.println("Point Loc: " + "(" + drunkard1.getCurrentLoc().getX() + "," + drunkard1.getCurrentLoc().getY() + ")");
			System.out.println("...expected stepSize: 1 \n");
			
			System.out.println("...Drunkard2 location:");
			System.out.println("Point Loc: " + "(" + drunkard2.getCurrentLoc().getX() + "," + drunkard2.getCurrentLoc().getY() + ")");
			System.out.println("...takeStep();");
			drunkard2.takeStep();
			System.out.println("...Drunkard2 location:");
			System.out.println("Point Loc: " + "(" + drunkard2.getCurrentLoc().getX() + "," + drunkard2.getCurrentLoc().getY() + ")");
			System.out.println("...expected stepSize: 2 \n");
			
			System.out.println("...Drunkard3 location:");
			System.out.println("Point Loc: " + "(" + drunkard3.getCurrentLoc().getX() + "," + drunkard3.getCurrentLoc().getY() + ")");
			System.out.println("...takeStep();");
			drunkard3.takeStep();
			System.out.println("...Drunkard3 location:");
			System.out.println("Point Loc: " + "(" + drunkard3.getCurrentLoc().getX() + "," + drunkard3.getCurrentLoc().getY() + ")");
			System.out.println("...expected stepSize: 30 \n");
			
			System.out.println("...multiple step test, run drunkard2 takeStep() for ten times");
			System.out.println("...Drunkard2 location:");
			System.out.println("Point Loc: " + "(" + drunkard2.getCurrentLoc().getX() + "," + drunkard2.getCurrentLoc().getY() + ")");
			System.out.println("...takeStep() for 10 times;");
			for(int i =0 ;i<9;i++)
			drunkard2.takeStep();
			System.out.println("...Drunkard2 location:");
			System.out.println("Point Loc: " + "(" + drunkard2.getCurrentLoc().getX() + "," + drunkard2.getCurrentLoc().getY() + ")");

	
			System.out.println("------------------------Testing takeStep() function 2-------------------------");
			System.out.println("This section will test if the drunkard program only moves the Drunkard by \nstepSize coordinate units and only in one of the four compass directions.");
			ImPoint tmp1 = drunkard2.getCurrentLoc();;
			ImPoint tmp2;
			int stepSize = 2;
			double dis;
			for(int i = 0;i<100;i++){
				 tmp1 = drunkard2.getCurrentLoc();
				 drunkard2.takeStep();
				 tmp2 = drunkard2.getCurrentLoc();
				 dis = (tmp1.getPoint2D()).distance(tmp2.getPoint2D());
				 if(dis != stepSize || ((Math.abs(tmp1.getX()-tmp2.getX())!=stepSize)&&((Math.abs(tmp1.getY()-tmp2.getY())!=stepSize)))){
					 System.out.println("Error in takeStep() Function!stepsize is wrong! ");
					 break;
				 }
				 if(i == 99) System.out.println("takeStep() function can be runned without error!");
			}
	}
}
