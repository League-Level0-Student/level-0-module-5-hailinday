package _06_for_loop_gauntlet;

public class loop {
	public static void main(String[] args) {
//	for (int i = 0; i <= 100; i++) {
//		System.out.println(i);
//	}

//	for (int q = 100; q >= 0; q--) {
//		System.out.println(q);
//	}

//		for (int w = 2; w <= 100; w++) {
//		if (w % 2 == 0) {
//				System.out.println(w);
//			}
//		}

//		for (int w = 1; w <= 99; w++) {
//		if (w % 2 == 1) {
//				System.out.println(w);
//				}
//			}

//		for (int e = 1; e <= 500; e++) {
//			if (e % 2 == 1) {
//					System.out.println(e + " is odd");
//					} else if (e % 2 == 0) {
//						System.out.println(e + " is even");
//					}
//				}

//		for (int r = 0; r <= 777; r++) {
//			if (r % 7 == 0) {
//					System.out.println(r);
//					}
//				}

//		for (int t = 2005; t <= 2020; t++) {
//				int p=t-2005;
//				System.out.println("In " + t + " I was " + p + " years old");
//					}

//		for (int a = 0; a < 3; a++) {
//			for (int b = 0; b < 3; b++) {
//				System.out.println(a + " " + b);
//			}
//				}

//				for (int i = 0; i <= 2; i++) {
//			for (int a = 1; a <= 3; a++) {
//				System.out.print(a + i * 3);
//				
//			}
//			System.out.println();
			
//		}
		
//		for (int i = 0; i <= 9; i++) {
//			for (int a = 1; a <= 10; a++) {
//				System.out.print(a + i * 10);
				
//			}
//			System.out.println();
			
//		}
		
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j<i; j++){ 
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
