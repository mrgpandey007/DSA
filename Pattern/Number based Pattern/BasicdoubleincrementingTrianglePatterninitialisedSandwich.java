import java.util.*;
class BasicdoubleincrementingTrianglePatterninitialisedSandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
	int temp = 2;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++) {
		System.out.print(temp++);
	    }
	    System.out.println();
        }
	temp-=n;
	for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i+1;j++) {
		System.out.print(temp++);
	    }
	    temp-=((n-i)*2+1);
	    System.out.println();
        }
        input.close();
    }
}