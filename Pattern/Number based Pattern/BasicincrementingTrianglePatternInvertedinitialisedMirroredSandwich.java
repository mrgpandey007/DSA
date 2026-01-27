import java.util.*;
class BasicincrementingTrianglePatternInvertedinitialisedMirroredSandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
	    int temp = i*(i+1)/2+1;
            for(int j=1;j<=i;j++) {
		System.out.print(temp--);
	    }
	    System.out.println();
        }
	int inc = n*(n+1)/2+1;
	for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i+1;j++) {
		System.out.print(inc--);
	    }
	    System.out.println();
        }
        input.close();
    }
}