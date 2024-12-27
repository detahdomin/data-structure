package CH03_2;

public class testsq {
    public static void main(String[] args) throws Exception{
        SqQueue dui_lie = new SqQueue(5);
        dui_lie.offer(1);
        dui_lie.offer(2);
        dui_lie.offer(3);
        dui_lie.offer(4);
        dui_lie.offer(5);
        dui_lie.poll();
        dui_lie.poll();
        dui_lie.display();
    }
}
