package CH04;

public class SqString implements IString {
private char[] strValue;
private int curLen;
//构造空串
public SqString(){
    strValue = new char[0];
    curLen = 0;
}
//以字符串常量构成串
public SqString(String str){
    char[]p = str.toCharArray();
    strValue = p;
    curLen = p.length;
}
//以字符数组构成串
public SqString(char[] str){
    strValue = new char[str.length];
    for(int i = 0;i<str.length;i++){
        strValue[i]=str[i];
    }
    curLen = str.length;
}
//将串变为空串
public void clear(){
    curLen = 0;
}
//串是否为空
public boolean isEmpty(){
    return curLen==0;
}
//返回长度
public int length(){
    return curLen;
}
//返回序号为i的长度
public char charAt(int i) throws Exception{
    if(i<0||i>=curLen)
        throw new StringIndexOutOfBoundsException(i);
    return strValue[i];
}
//将串的长度扩充为newCapacity
public void allocate(int newCapacity){
    char[] tmp=strValue;
    strValue = new char[newCapacity];
    for(int i = 0;i<tmp.length;i++){
        strValue[i]=tmp[i];
    }
}
//返回位序号从begin到end-1的子串
public IString subString(int begin, int end){
    if(begin<0||begin>=end||end>curLen)//判断参数是否合法
        throw new StringIndexOutOfBoundsException("参数不合法");
    char[]tmp=new char[end-begin];
    for(int i=begin;i<end;i++)
        tmp[i-begin]= strValue[i];
    return new SqString(tmp);
}
//在第i个字符串之前插入字符
public void insert(int i, IString str) throws Exception{
}
//删除位序号从begin 到 end-1的子串
public void delete(int begin, int end){

}
//将str连接到字符串的后面
public void concat(IString str){
}
//比较str和当前字符串大小
public int compareTo(IString str){

}
//从位序号为 begin 的字符开始搜索与 str 相等的子串
public int indexOf(IString str, int begin){

}

