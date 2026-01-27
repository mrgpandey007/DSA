import java.util.*;
class DiamondStarPattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
        for(int i=1;i<=n;i++) {
	    for(int j=1;j<=n-i;j++) {
         	System.out.print(" ");
	    }

	    for(int j=1;j<2*i;j++) {
		System.out.print("*");
	    }
            System.out.println();
        }
	for(int i=1;i<n;i++) {
	    for(int j=1;j<=i;j++) {
         	System.out.print(" ");
	    }

	    for(int j=1;j<(2*(n-i));j++) {
		System.out.print("*");
	    }
            System.out.println();
        }
        input.close();
    }
}