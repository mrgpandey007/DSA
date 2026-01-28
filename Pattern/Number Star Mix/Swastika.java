import java.util.*;
class Swastika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int half = n/2+1;
        for (int i = 1; i <= n; i++) {				
	    for(int j = 1;j <= n; j++) {
		if(i==half||j==half||(i==1&&j>half)||(i==n&&j<half)||(j==1&&i<half)||(j==n&&i>half)) {
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