import java.util.*;
class RectangleStarPattern{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Number\t:");
	int n = input.nextInt();
	for(int i=1;i<n;i++) {
	    for(int j=0 ; j< n ;j++){
	    	System.out.print("*");
	    }
	    System.out.println();
	}
	input.close();
    }
}