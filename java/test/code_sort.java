//入队
public void offer(Objiect x) throws Excepthon{
    if(rear==maxSize)
        throw Exception("队列已满");
    queueElem[rear]=x;
    rear++;
}
//出栈操作
public Objiect pop(){
    if(isEmpty())
        return null;
    top--;
    return stackElem[top];
}
//入栈操作
public void push(Objiect x)throw Excepthon{
    if(top == maxSize){
        throw Exception("栈已满");
    }
    Elem[top]=x;
    top++;
}
//后序遍历
public void postOrder(BiTreeNode root){
    postOrder(root.lchild);
    postOrder(root.rchild);
    System.out.print(root.data+" ");
}
//直接插入排序
public void insertSort(){
    RecordNode p = new RecordNode();
    for(int i=1;i<len;i++){ //进行 len-1 次扫描
        p = list[i];
        int j;
        for(j=i-1;j >= 0;j--){  //比 list[i]大的元素后移
            if(list[j].key>p.key){
                list[j+1]=list[j];
            }
            else
                break;
        }
        list[j+1] = p; //插入
    }
}
//直接选择排序
public void slectSort(){
    RecordNode p = new RecordNode();
    for(int i=0;i<len-1;i++){ // 进行 n-1一趟选择
        int min=i;
        for(int j=i;j<len;j++){ //寻找关键字值最小的记录的位置
            if(list[j].key<list[min].key)
                min = j;
        }
        if(min!=i){ //交换位置
            p = list[i];
            list[i] = list[min];
            list[min] = p
        }
    }
}
//冒泡排序
public void bubbleSort(){
    RecordNode p = new RecordNode();
    boolean flag = true;
    for(int i=1;i<=len&&flag;i++){
        if(list[j+1].key<list[j].key){
            p = list[j];
            list[j] = list[j+1];
            list[j+1] = p;
            flag = true;
        }
    }
}