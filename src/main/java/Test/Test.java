package Test;

import lombok.NoArgsConstructor;

/**
 * @author : Shadow
 * @className : Test
 * @description :TODO
 * @date : 2021/01/27 19:12
 **/
public class Test {

    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, null));
        System.out.println(node.getNode().getVal());

        swap(node.getNode());
        System.out.println(node.getNode().getVal());
    }

    private static void swap(Node node) {
        node = new Node(4, null);
    }


    static class Node {
        private int val;
        private Node node;

        public Node(int val, Node node) {
            this.val = val;
            this.node = node;
        }

        public int getVal() {
            return val;
        }

        public Node getNode() {
            return node;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNode(Node node) {
            this.node = node;
        }
    }
}
