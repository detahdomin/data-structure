package CH03_2;

public class SqQueue implements IQueue{
    private Object[] queueElem;
    private int front;
    private int rear;
    private int maxSize;
    public SqQueue(int maxSize){
        front = rear = 0;
        queueElem = new Object[maxSize];
        this.maxSize = maxSize;
    }
    @Override
    public void clear() {
        front = rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return rear==front;
    }

    @Override
    public int length() {
        return rear-front;
    }

    @Override
    public Object peek() {
        if(isEmpty())
            return null;
        return queueElem[front];    
    }

    @Override
    public void offer(Object x) throws Exception {
        if(rear == maxSize)
            throw new Exception("队列已满");
        queueElem[rear] = x;
        rear++;
    }

    @Override
    public Object poll() {
        if(rear==front)
            return null;
        Object p = queueElem[front];
        front++;
        return p;
    }

    @Override
    public void display() {
        if(!isEmpty()){
            for(int i=front;i<rear;i++){
                System.out.print(queueElem[i]+"");
            }
        }
        else{
            System.out.print("此队列为空");
        }
    }

}