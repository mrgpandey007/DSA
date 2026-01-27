import java.util.Scanner;

public class CHESSBOARD {
    public static String determineColor(String s) {
        return (s.charAt(0)+s.charAt(1))%2==1?"White":"Black";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String s = scanner.nextLine().trim();
            String result = determineColor(s);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }
}