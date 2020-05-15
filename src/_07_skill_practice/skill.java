package _07_skill_practice;
import javax.swing.JOptionPane;

public class skill {
		public static void main(String[] args) {

		skill skills = new skill();
		          	skills.skill1();
		         	skills.skill2();
		//          	skills.skill3();
	//	          	skills.skill4();
	//	          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String money = JOptionPane.showInputDialog("How many dimes do you have?");
		


		// Tell them how many cents they have (hint multiply by 10)
		int i = Integer.parseInt(money);
		JOptionPane.showMessageDialog(null, "You have " + i*10 + " cents.");


		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you(inches)?");
		int q = Integer.parseInt(height);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (q <= 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
		}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

for (int m = 0; m < 30; m++) {
	if (m % 3 == 0) {
		System.out.println(m);
	}
}



}
}
