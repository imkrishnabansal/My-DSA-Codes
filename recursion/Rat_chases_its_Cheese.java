package recursion;
import java.util.*;

public class Rat_chases_its_Cheese {
    static boolean val = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        MazePath(maze, 0, 0, ans);
        if (!val) {
            System.out.println("NO PATH FOUND");
        }
    }

    public static void MazePath(char[][] maze, int cr, int cc, int[][] ans) {
        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            val = true;
            Display(ans);
            return;
        }
        if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        MazePath(maze, cr - 1, cc, ans);
        MazePath(maze, cr, cc - 1, ans);
        MazePath(maze, cr + 1, cc, ans);
        MazePath(maze, cr, cc + 1, ans);

        // Backtrack
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    public static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}