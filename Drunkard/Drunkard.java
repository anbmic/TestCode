/******************************************************
 * File: 		Drunkard.java
 * Author: 		Jiaxin Ye
 * USC LoginID: jiaxinye
 * Course: 		CS 455 PA1 Fall 2013
 * 
 * Description: This program is designed to update the 
 * 				drunkard's location according to the 
 * 				total time count and time step.
 * 
 *****************************************************/

import java.util.Random;
/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/

public class Drunkard {

    /**
       Creates drunkard with given starting location and distance
       moved in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
	private ImPoint curPoint;
	private int stepSize;
	private Random rmd;
	
    public Drunkard(ImPoint startLoc, int theStepSize) {
    	curPoint = new ImPoint(0,0);
    	curPoint = curPoint.translate(startLoc.getX(),startLoc.getY());
    	//System.out.println("Point Loc: " + "(" + curPoint.getX() + "," + startLoc.getY() + ")");
    	stepSize = theStepSize;
    	rmd = new Random(System.currentTimeMillis());
    }


  	/**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
    	//System.out.println(""+Math.abs(rmd.nextInt()%4));
    	switch(rmd.nextInt(4)){	
    	case 0:
    		curPoint = curPoint.translate(-stepSize, 0);//go right
    		break;
    	case 1:
    		curPoint = curPoint.translate(0, stepSize);//go down
    		break;
    	case 2:
    		curPoint = curPoint.translate(stepSize, 0);//go left
    		break;
    	case 3:
    		curPoint = curPoint.translate(0, -stepSize);//go up
    		break;
    	}
    }


    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
	return curPoint;  // REMOVE this line -- dummy code to get it to compile
    }

}
