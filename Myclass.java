import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int a[]=new int[5];
        int avg=0,avg1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
           avg=a[0]+a[1]+a[2];
        avg=avg/3;
        avg1=a[3]+a[4];
        avg1=avg1/2;
        if(avg==avg1)
        {
            System.out.print("["+a[0]+","+a[1]+","+a[2]+"],");
            System.out.print("["+a[3]+","+a[4]+"]");
        }
        else
        {
            System.out.print("Not possible");
        }
    }
}
