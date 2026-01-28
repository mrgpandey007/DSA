import java.util.*;
class AusingStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number(Not should be greater or equal to 3\t:");
        int n = input.nextInt();
	if(n<=3) {
	    System.out.println("ERROR 502\nYou Didn't follow the instruction");
	    return;
	}
        for (int i = 1; i <= n; i++) {
	    if(i==1) {
		System.out.print(" ");
		for(int j=2;j<n;j++){
		    System.out.print("*");
	        }
		System.out.println();
	    } else if(i==n/2+1) {
		for(int j=1;j<=n;j++){
		    System.out.print("*");
	        }
		System.out.println();
	    } else {
		System.out.print("*");
		for(int j=2;j<n;j++){
		    System.out.print(" ");
	        }
		System.out.print("*\n");
	    }		
        }
        input.close();
    }
}