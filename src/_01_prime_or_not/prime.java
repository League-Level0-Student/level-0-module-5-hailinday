package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		
			String input = JOptionPane.showInputDialog(null, "Insert any number");
			int number = Integer.parseInt(input);
			if(number == 1) {
				JOptionPane.showMessageDialog(null, "The number is not prime");
			}
			if(number == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime");
			}
			if(number < 0) {
				JOptionPane.showMessageDialog(null, "Please input a positive number");
			}
			if(number == 2) {
				JOptionPane.showMessageDialog(null, "The number is prime");
			}
			for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "The number is prime");
				break;
			}
			
			}
		}
	}
