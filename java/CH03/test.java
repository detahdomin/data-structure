package CH03;
public class test extends SqStack{
    public test(int maxSize) {
        super(maxSize);
    }

    public static void main(String []args)throws Exception{
        String str1="(a+b*(c+d))";
        String str2="(a+b*(c+d)))";
        SqStack q = new SqStack(str1.length());
        q.isMatched(str1);
        @SuppressWarnings("unused")
        SqStack p = new SqStack(str2.length());
        q.isMatched(str2);
    }
}


