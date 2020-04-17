package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
int one = 0;
int two = 1;
System.out.println(one + " " + two);
	for (int i = 2; i < 13; i++) {
		int three=one + two;
		System.out.println(" " + three);
		one=two;
		two = three;
	}

}
}
