package CH03_1;
import CH02_1.Node;
public class SqStack implements IStack{
    private Node top;
    @Override
    public void clear() {
        top=null;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int length() {
        Node p = top;
        int length=0;
        while (p!=null) {
            p = p.next;
            length++;
        }
        return length;
    }

    @Override
    public Object peek() {
        if(!isEmpty())
            return top.data;
        else    
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        Node s=new Node(x);
        s.next=top;
        top=s;
    }

    @Override
    public Object pop() {
        if(isEmpty())
            return null;
        Node p = top;
        top = top.next;
        return p.data;
    }

    @Override
    public void display() {
        Node p = top;
        while (p!=null) {
            System.out.print(p.data+"");
            p = p.next;
        }
    }
}
