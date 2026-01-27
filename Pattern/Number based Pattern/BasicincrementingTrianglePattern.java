import java.util.*;

class BasicincrementingTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int inc = n+2;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i+1;j++) {
		System.out.print(inc);
	    }
	    inc--;
	    System.out.println();
        }
        input.close();
    }
}