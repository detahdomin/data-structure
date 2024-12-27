package ch;

import CH03_2.SqQueue;

public class TestSQ {

    public static void main(String[] args) throws Exception{
        SqQueue sq=new SqQueue(10);
        sq.offer(1);
        sq.offer(2);
        sq.offer(3);
        sq.poll();
        sq.offer(4);
        sq.offer(5);
        sq.poll();
        sq.display();
    }
}