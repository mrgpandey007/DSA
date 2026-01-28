import java.util.*;
class BasicincrementinginvertedSquaredNumberStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int temp = n * (n - 1) +1;
        for (int i = 1; i <= n; i++) {					    for(int j=1;j<=n;j++) {
	  	if(j==1) System.out.print(temp++); 
		else   System.out.print("*" + temp++);
	    } 
	    temp -= 2*n;
	    System.out.println();
        }
        input.close();
    }
}