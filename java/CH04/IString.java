package CH04;
public interface IString {
    public void clear();
    public boolean isEmpty();
    public int length();
    public char charAt(int i) throws Exception;
    public IString subString(int begin,int end);
    public IString insert(int i,IString str);
    public IString delete(int begin,int end);
    public IString concat(IString str);
}
