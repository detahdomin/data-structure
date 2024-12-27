package java.ch;
import java.util.Scanner;
public class testBS {
    
    public static void BubbleSort(int[] s){
        int p;
        boolean flag=true;
        for(int i=1;i<s.length&&flag;i++){
            flag = false;
            for(int j=0;j<=s.length-i-1;j++){
                if(s[j+1]<s[j]){
                    p=s[j];
                    s[j]=s[j+1]
                    flag= true
                }
            }
            System.out.println("第"+i+"趟排序");
            for(int k=0;k<s.length;k++){
                System.out.print(s[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.inp;)
    }
}
