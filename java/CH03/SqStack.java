package CH03;

import CH03_1.IStack;

public class SqStack implements IStack {
private Object[] stackElem;
private int top;
private int maxSize;
public SqStack(int maxSize){
    top=0;
    this.maxSize=maxSize;
    stackElem=new Object[maxSize];
}
@Override
public void clear() {
    top = 0;
}

@Override
public boolean isEmpty() {
    return top==0;
}

@Override
public int length() {
    return top;
}

@Override
public Object peek() {
    if(!isEmpty())
        return stackElem[top-1];
    else
        return null;
}

@Override
public void push(Object x) throws Exception {
    if(top==maxSize)
        throw new Exception("栈已满");
    stackElem[top]=x;
    top++;
}

@Override
public Object pop() {
    if(isEmpty())
        return null;
    top--;
    return stackElem[top];
}

@Override
public void display() {
    for(int i=top-1;i>=0;i--){
        System.out.print(stackElem[i]+" ");
    }
}
public void isMatched(String str) throws Exception  {
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==')'){
            push('(');
        }
        else if(str.charAt(i)==')'&&!isEmpty()){
            pop();
        }
        else if(str.charAt(i)==')'&&isEmpty()){
            System.out.println("括号不匹配");
            return;
    }
}
if(isEmpty()){
    System.out.println("括号匹配");
}
else{
    System.out.println("括号不匹配");
}
}
}
