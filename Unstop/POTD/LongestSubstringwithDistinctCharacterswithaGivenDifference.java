import java.util.Scanner;
import java.util.HashSet;
public class LongestSubstringwithDistinctCharacterswithaGivenDifference {
    public static int findLongestDistinctSubstring(int N, int D, String s) {
        int max=-1;
        for(int i=0;i<N;i++) {
            HashSet<Character> count=new HashSet<>();

            for(int j=i;j<N;j++) {
                if(count.contains(s.charAt(j))) break;
                count.add(s.charAt(j));
                if (Math.abs(s.charAt(i) - s.charAt(j)) == D) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int N = scanner.nextInt();
            int D = scanner.nextInt();
            String S = scanner.next();
            int result = findLongestDistinctSubstring(N, D, S);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }
}