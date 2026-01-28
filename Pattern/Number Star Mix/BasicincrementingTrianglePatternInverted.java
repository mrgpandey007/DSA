import java.util.*;
class BasicincrementingTrianglePatternInverted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int even = 4,old = 1,oldrow=1,evenrow=3;
        for (int i = 1; i <= n; i++) {
	    if(i%2==1) {
		for(int j=1;j<=oldrow;j++) {
		    if(j==1) {
			System.out.print(old++);
		    } else {
			System.out.print("*"+ old++);
		    }
	        }
		oldrow++;
	    } else {
		for(int j=1;j<=evenrow;j++) {
		    if(j==1) {
			System.out.print(even++);
		    } else {
			System.out.print("*"+ even++);
		    }
	        }
		evenrow++;
	    }
	    System.out.println();
        }
        input.close();
    }
}