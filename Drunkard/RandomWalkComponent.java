/******************************************************
 * File: 		RandomwWalkComponent.java
 * Author: 		Jiaxin Ye
 * USC LoginID: jiaxinye
 * Course: 		CS 455 PA1 Fall 2013
 * 
 * Description: This program is designed to handle the 
 * 				painting event and location printing.
 * 
 *****************************************************/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JComponent;

public class RandomWalkComponent extends JComponent{

	private Drunkard drunkard;
	private int numberOfStep;
	private int totalStep;
	private ImPoint prevPoint;
	private Vector<ImPoint> pArray;
	
	//Constructor
	public RandomWalkComponent(int theTotalStep){
		prevPoint = new ImPoint(200,200);
		drunkard = new Drunkard(prevPoint,5);
		pArray = new Vector<ImPoint>();
		totalStep = theTotalStep;
		numberOfStep = 0;
	}
	
	
	//Handle the Painting Event
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		for(int i=0;i<pArray.size()-1;i++){
			 g.drawLine(pArray.elementAt(i).getX(),pArray.elementAt(i).getY(),pArray.elementAt(i+1).getX(),pArray.elementAt(i+1).getY());
		}
		
		
	}
	/*
	public static void slow (int n){
	    long t0,t1;
	    t0=System.currentTimeMillis();
	    do{
	        t1=System.currentTimeMillis();
	    }
	    while (t1-t0<n);
	}
	*/
	
	//Go to the next step if there is reminding steps
	public boolean nextStep(){
		boolean isFinished = false;
		if(numberOfStep < totalStep){
			numberOfStep++;
			pArray.add(drunkard.getCurrentLoc());
			drunkard.takeStep();
//			repaint();
//			slow(50);
			printStep();
			
		}
		else{
			isFinished = true;
			repaint();
		}
		return isFinished;
	}
	
	//Print the location
	public void printStep(){
		System.out.println("PrevPoint Loc: " + "(" + prevPoint.getX() + "," + prevPoint.getY() + ")");
		System.out.println("Point Loc: " + "(" + drunkard.getCurrentLoc().getX() + "," + drunkard.getCurrentLoc().getY() + ")");
		System.out.println("Remain Step: " + (totalStep - numberOfStep));
		
		if(totalStep - numberOfStep==0)
		System.out.println("Random walk finished");
	}
	
	
}