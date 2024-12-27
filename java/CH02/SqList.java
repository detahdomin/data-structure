package CH02;

public class SqList implements IList {
    private Object[] listItem;
    private int curLen;
    private int maxSize;


    public SqList(int maxsize){
        curLen=0;
        maxSize=maxsize;
        listItem=new Object[maxSize];
    }
    @Override
    public void clear() {
        curLen=0;
    }
    @Override
    public boolean isEmpty() {
        return curLen==0;
    }
    @Override
    public int length() {
        return curLen;
    }
    @Override
    public Object get(int i) throws Exception {
        if(i<0||i>curLen-1)
            throw new Exception("第"+i+"个元素不存在");
        return listItem[i];
    }
    @Override
    public void insert(int i, Object x) throws Exception {
        if(curLen==maxSize)
            throw new Exception("顺序表满");
        if(i<0||i>curLen)
            throw new Exception("插入位置非法");
        for(int j=curLen;j>i;j--)
            listItem[j]=listItem[j-1];
        listItem[i]=x;
        curLen++;
    }
    @Override
    public void remove(int i) throws Exception {
        if(i<0||i>curLen-1)
            throw new Exception("删除位置非法");
        for(int j=i;i<curLen-1;i++)
            listItem[j]=listItem[j+1];
        curLen--;
    }
    @Override
    public int indexOf(Object x) {
        for(int i=0;i<=curLen-1;i++)
        {
            if(listItem[i].equals(x))
                return i;
        }
        return -1;
    }
    @Override
    public void display() {
        for(int i =0;i<curLen-1;i++)
            System.out.print(listItem[i]+"");
    }
}
