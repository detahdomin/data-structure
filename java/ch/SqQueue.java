package ch;

import CH03_2.IQueue;

public class SqQueue implements IQueue{
    private Object[] queueElem;
    private int front;
    private int rear;
    private int maxSize;
    public SqQueue(int maxSize){
        front=rear=0;
        queueElem= new Object[maxSize];
        this.maxSize=maxSize;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public void offer(Object x) throws Exception{
        if(rear==front)
            throw Exception("队列已满");
        queueElem[rear]=x;
        rear++;
    }
    public Object poll(){
        if(rear==front)
            return null;
        Object p = queueElem[front];
        front++;
        return p;
    }
    public void display(){
        if(!isEmpty()){
            for(int i=front;i<rear;i++){
                System.out.println(queueElem[i]+" ");
            }
        }
        else{
            System.out.println("此队列已空");
        }
    }
}