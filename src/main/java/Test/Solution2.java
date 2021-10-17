package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Shadow
 * @className : Solution
 * @description :TODO
 * @date : 2021/02/02 15:19
 **/
public class Solution2 {

    private List<List<String>> res = new ArrayList<>();
    /**
     * 记录这列是否被占用
     */
    private boolean[] column;

    /**
     * 记录同一斜线上是否被占用
     */
    private boolean[] dia1;
    /**
     * 记录同一斜线上是否被占用
     */
    private boolean[] dia2;

    public List<List<String>> solveNQueens(int n) {
        if (n <= 0) {
            return res;
        }
        column = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        putQueen(n, 0, new ArrayList<>(n));

        return res;
    }

    private void putQueen(int n, int index, ArrayList<Integer> list) {
        if (n == index) {
            res.add(generateBroad(n, list));
            return;
        }

        for (int i = 0; i < n; i++) {
            // 如果列和两对角线都没有冲突,则放入皇后
            if (!column[i] && !dia1[index + i] && !dia2[index - i + n]) {
                column[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n] = true;
                list.add(i);
                putQueen(n, index + 1, list);
                list.remove(list.size() - 1);
                column[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n] = false;
            }

        }


    }

    private ArrayList<String> generateBroad(int n, ArrayList<Integer> list) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] arr = new char[n];
            // 先填充'.'
            Arrays.fill(arr, '.');
            // 再到对应位置修改为'Q'
            arr[list.get(i)] = 'Q';
            strings.add(new String(arr));
        }
        return strings;
    }

    public static void main(String[] args) {
        final List<List<String>> lists = new Solution2().solveNQueens(4);
        lists.forEach(System.out::println);
        System.out.println(lists.size());

    }
}
