package CH02;
public class test{
    static void main(String[] args) throws Exception {
        SqList q = new SqList(5);
        q.insert(0,89);
        q.insert(1,93);
        q.insert(2,92);
        q.insert(3,90);
        q.insert(4,100);
        int res = q.indexOf(90);
        if(res==-1)
            System.out.println("顺序表中不存在成绩为90的数据元素");
        else
            System.out.println("顺序表中存在成绩为90的数据元素"+res);
    }       
}