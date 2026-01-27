import java.util.*;

class BasicincrementingTrianglePatternInverted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int inc = 3;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++) {
		System.out.print(inc);
	    }
	    inc++;
	    System.out.println();
        }
        input.close();
    }
}