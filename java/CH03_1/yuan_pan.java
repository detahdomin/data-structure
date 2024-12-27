package CH03_1;

public class yuan_pan {
    public static void haooi(int n,char x,char y,char z){
        if(n==1)
            move(1, x, z);
        else{
            haooi(n-1, x, y, z);
            move(n, x, z);
            haooi(-1, x, y, z);
        }
    }
    public static void move(int n,char x,char z){
        System.out.println("将圆盘:"+n+"从塔座"+x+"移动到塔座"+z+"");
    }
    public static void main(String []args){
        haooi(3, 'x', 'y', 'z');
    }
}
