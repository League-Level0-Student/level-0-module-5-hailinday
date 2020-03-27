package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		while (true) {
			String input = JOptionPane.showInputDialog(null, "Insert any number");
			int number = Integer.parseInt(input);
			for (int i = 1; i <= number; i++) {
			if (number % i == number && number % i == 1) {
				JOptionPane.showMessageDialog(null, "The number is prime");
			}
			else {
				JOptionPane.showMessageDialog(null, "The number is not prime");
				}
			}
		}
	}
}
