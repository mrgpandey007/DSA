import java.util.*;
class Numberinvertedpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int half = n/2+1;
        for (int i = 1; i <= n ; i++) {	
	    for(int j = 1;j < i; j++) { 
		System.out.print(" ");
	    }			
	    for(int j = n-i+1;j > 0; j--) {
		System.out.print(j);
	    }
	    for(int j = 2;j <= n-i+1; j++) {
		System.out.print(j);
	    }
	    System.out.println();
        }
	for (int i = 2; i <= n ; i++) {	
	    for(int j = 1;j <= n-i; j++) { 
		System.out.print(" ");
	    }			
	    for(int j = i;j > 0; j--) {
		System.out.print(j);
	    }
	    for(int j = 2;j <= i; j++) {
		System.out.print(j);
	    }
	    System.out.println();
        }
        input.close();
    }
}