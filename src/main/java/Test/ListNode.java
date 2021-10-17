package Test;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 添加一个头结点
        ListNode pre = new ListNode(val + 1);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode node = removeElements(head, 1);
        print(node);
    }

    public static void print(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }


    public class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // 根入队
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                level.add(treeNode.val);
                if(treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if(treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            lists.add(level);
        }


        return lists;
    }
}
