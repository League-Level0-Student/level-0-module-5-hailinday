package _09_obedient_robot;

import java.applet.AudioClip;
import java.awt.Color;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import _08_code_4_life.Code4Life;

public class obedientRobot {
	static Robot rob = new Robot("mini");

	public static void main(String[] args) {
		rob.setSpeed(100);
		rob.penDown();
			String color = JOptionPane.showInputDialog("Which color do you want");
		if (color.equalsIgnoreCase("Black")) {
			rob.setPenColor(Color.black);
		} else if (color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.red);
		}
		String shape = JOptionPane.showInputDialog("Which shape do you want");
		if (shape.equalsIgnoreCase("Square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else {
			drawCircle();
		}
	
	}
	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(30);
			rob.turn(90);
		}
	}

	private static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.move(60);
			rob.turn(120);
		}
	}
	private static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
	}
}
