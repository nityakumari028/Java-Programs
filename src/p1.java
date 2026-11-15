import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int CG = (int)(Math.random() * 9) + 1;

	        System.out.print("Enter user number: ");
	        int UG = sc.nextInt();

	        System.out.println("Computer guesses: " + CG);

	        if (UG == CG) {
	            System.out.println("You got it right");
	        } else if ((UG == CG + 1)|| (UG == CG -1)) {
	            System.out.println("Almost got it");
	        } else {
	            System.out.println("You got it wrong");
	        }

	        sc.close();

	}

}
