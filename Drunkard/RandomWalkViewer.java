/******************************************************
 * File: 		RandomwWalkViewer
 * Author: 		Jiaxin Ye
 * USC LoginID: jiaxinye
 * Course: 		CS 455 PA1 Fall 2013
 *  
 * Description: This program is designed to provide
 * 				a user interface for Drunkard program
 * 				which ask the user to input necessary 
 * 				data. It also provides the JFrame for
 * 				the program.
 * 
 *****************************************************/

import javax.swing.JFrame;
import java.util.Scanner;

class RandomWalkViewer{
	
	public static void main(String[] arg){
		
		//input data
		Scanner in = new Scanner(System.in);
		
		int totalStep = 0;
		int stepSize = 0;
		
		System.out.println("Please enter the total number of random walk steps:");
		totalStep = in.nextInt();
		while(totalStep<=0){
			System.out.println("Total number of random walk steps should be a positive number greater than 0. Please re-enter:");
			totalStep = in.nextInt();
		}
		/*
		System.out.println("Please enter the step size:");
		stepSize = in.nextInt();
		while(stepSize<=0){
			System.out.println("The step should be a positive number greater than 0.");
			stepSize = in.nextInt();
		}
		*/
		//build Jframe and call RandomWalkComponent
		JFrame frame = new JFrame("Drunkard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		RandomWalkComponent randomWalk = new RandomWalkComponent(totalStep);
		
		frame.add(randomWalk);
		
		//Keep doing nextStep until the step count returns to zero 
		while(!randomWalk.nextStep());
		in.close();
	}
}