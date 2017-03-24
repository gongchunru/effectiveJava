package com.java.algorithm.test.QuestionTest;

/**
 * Created by gongchunru on 2016/11/15.
 */
public class TestQT {

    public static void main(String[] args) {

        Node head = new Node(0);;
        Node tmp = null;//保存临时变量
        Node cur = null;//始终指向尾节点
        for (int i = 1; i < 10; i++) {
            tmp = new Node(i);
            if (i==1){
                head.next = tmp;
            }else {
                cur.next = tmp;
            }
            cur = tmp;
//            cur = head.next;
        }

        printNodes(head);

        System.out.println("递归的方法");
        head = reverse(head);
        printNodes(head);
        System.out.println("非递归的方法");
        head = reverse2(head);
        printNodes(head);
    }


    private static void printNodes(Node head){
        System.out.print(head.node+"\t");
        while (head.next != null) {
            System.out.print(head.next.node + "\t");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){

        if (head == null || head.next == null){
            return head;
        }
        Node newNode = reverse(head.next);
        //获取先前的下一个节点，让该节点指向自身
        head.next.next = head;
        //破坏以前自己指向的下一个节点
        head.next = null;
        //层层传递给最上面的
        return newNode;
    }

    //遍历，将当前节点的下一个节点缓存后，更改当前节点的指针。
    public static Node reverse2(Node head){
        if (null == head){
            return head;
        }
        Node pre = head;
        Node cur = head.next;
        Node next;

        while (cur !=null){
            //先找到原始的下一个节点
            next = cur.next;
            //逆序链接
            cur.next = pre;
            //两个节点之间同时滑动
            pre = cur;
            cur = next;
        }
        //将原链表的头结点的下一个节点置为null，再将反转后的头节点赋值给head
        head.next = null;
        head = pre;
        return head;
    }
}
