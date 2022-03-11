import java.util.Scanner;
public class fibonacci {
    public static void calcFibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        calcFibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of fibonacci series : ");
        int num=sc.nextInt();

        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        calcFibo(a, b, num-2);
    }
}
