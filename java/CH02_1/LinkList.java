package CH02_1;

import java.util.Scanner;

public class LinkList implements IList{
    public Node head;
    public LinkList(){
        head = new Node();
    }
    public LinkList(int n,boolean Order) throws Exception{
        this();
        if(Order)
            create1(n);
        else
            create2(n);
    }
    //尾插
    public void create1(int n) throws Exception{
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            insert(length(),sc.next());
        }
    }
    //头插
    public void create2(int n) throws Exception{
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            insert(0,sc.next());
        }
    }
    @Override
    public void clear() {
        head.data=null;
        head.next=null;
    }

    @Override
    public boolean isEmpty() {
        return head.next==null;
    }

    @Override
    public int length() {
        Node p=head.next;
        int length=0;
        while (p!=null) {
            p = p.next;
            length++;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {
        Node p = head.next;
        int j;
        for(j=0;j<i&&p!=null;j++){
            p = p.next;
        }
        if (j>i||p==null)
            throw new Exception("第"+i+"个数据元素不存在");
        return p.data;
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j=-1;
        while (p!=null&&j<i-1) {
            p=p.next;
            j++;
        }
        if(j>i-1||p==null)
            throw new Exception("插入位置不合法");
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }

    @Override
    public void remove(int i) throws Exception {
        Node p = head;
        int j= -1;
        while (p!=null&&j<i-1) {
            p=p.next;
            j++;
        }
        if(j>i-1||p==null)
            throw new Exception("删除位置不合法");
        p.next = p.next.next;
    }

    @Override
    public int indexOf(Object x) {
        Node p = head.next;
        int j = 0;
        while (p!= null&&p.data.equals(x)) {
            p = p.next;
            j++;
        }
        if(p!=null)
            return j;
        else
            return -1;
        
    }

    @Override
    public void display() {
        Node p = head.next;
        while (p!=null) {
            System.out.print(p.data+"");
            p=p.next;
        }
    }

}