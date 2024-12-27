package CH02_1;

import java.util.Scanner;

public class test2_1 {
    public static void main(String []args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n,val;
        n = sc.nextInt();
        LinkList l = new LinkList();
        for(int i = 0;i<n;i++){
            Node q = l.head;
            val = sc.nextInt();
            Node p = new Node(val);
            while (q!=null&&q.next!= null&&Integer.valueOf(q.next.data.toString())<val) {
                q = q.next;
            }
            p.next = q.next;
            q.next = p;
        }
        Node k = l.head;
        for(int i = 0;i<n;i++){
            k=k.next;
            System.out.println(k.data);
        }
    }
}
