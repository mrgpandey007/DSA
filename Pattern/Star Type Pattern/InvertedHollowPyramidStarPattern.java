import java.util.*;
class InvertedHollowPyramidStarPattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
        for(int i=1;i<=n;i++) {
	    for(int j=1;j<i;j++) {
         	System.out.print(" ");
	    }

	    for(int j=1;j<(n-i)*2;j++) {
		if(i==1||i==n|| j==1 || j==2*(n-i)-1) {
		    System.out.print("*");   
		} else {
		    System.out.print(" ");
		}
	    }
            System.out.println();
        }
        input.close();
    }
}