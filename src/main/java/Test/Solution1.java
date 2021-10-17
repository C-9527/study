package Test;

import java.util.List;

/**
 * @author : Shadow
 * @className : Solution
 * @description :TODO
 * @date : 2021/02/01 07:43
 **/
public class Solution1 {

    /**
     * 二维网的宽度
     */
    private int w;
    /**
     * 二维网的长度
     */
    private int l;
    /**
     * 上右下左
     */
    private int[][] arr = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    /**
     * 所有的不被包围的 O 都直接或间接与边界上的 O 相连
     */
    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        this.w = board.length;
        this.l = board[0].length;
        // 从边界开始延伸'O'的范围
        for (int i = 0; i < l; i++) {
            dfs(board, 0, i);
            dfs(board, w - 1, i);
        }
        for (int i = 0; i < w; i++) {
            dfs(board, i, 0);
            dfs(board, i, l - 1);
        }
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                // 如果是A则把他替换为O
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int x, int y) {
        // 坐标合法但不等于'O'则返回
        if (!inArea(x, y) || board[x][y] != 'O') {
            return;
        }
        // 否则把'O'标记为'A'
        board[x][y] = 'A';
        // 在该坐标的上下左右寻找'O'
        for (int i = 0; i < 4; i++) {
            int newx = x + arr[i][0];
            int newy = y + arr[i][1];
            dfs(board, newx, newy);
        }
    }

    private boolean inArea(int x, int y) {
        return 0 <= x && x < this.w && 0 <= y && y < this.l;
    }

    public static void main(String[] args) {

    }


}
