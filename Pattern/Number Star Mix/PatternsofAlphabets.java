import java.util.*;
class PatternsofAlphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number\t:");
        int n = input.nextInt();
        for (char c ='A'; c <= n+64; c++) {
	    for(char v = c;v <= n+64 ; v++){
		System.out.print(v+" ");
	    }
	    System.out.println();
        }
        input.close();
    }
}