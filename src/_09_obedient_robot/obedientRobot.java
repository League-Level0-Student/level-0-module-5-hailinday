package _09_obedient_robot;

import java.applet.AudioClip;

import javax.swing.JApplet;

import org.jointheleague.graphical.robot.Robot;

import _08_code_4_life.Code4Life;

public class obedientRobot {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.penDown();
		
		private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(30);
			rob.turn(90);
		}
		}
	}
}
