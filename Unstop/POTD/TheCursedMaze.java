import java.util.Scanner;

public class TheCursedMaze {
    public static int userLogic(int[][] maze) {
        int value = 0;
        for(int[] row : maze) {
            for(int num:row) {
                if(num>0) {
                    value+=num;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] maze = new int[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                maze[i][j] = scanner.nextInt();
            }
        }
        // Call user logic function and print the output
        int result = userLogic(maze);
        System.out.println(result);
        scanner.close();
    }
}