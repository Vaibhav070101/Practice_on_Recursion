import java.util.Scanner;
public class factorial{
    public static int calcFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_num1=calcFactorial(n-1); // by this we are calculating 1 to n times calculation necessary
                                          //while stacking up the memory...
        
        int fact_num=n * fact_num1;       // calculating the factorial while stack memory is cleaning up...
        
        return fact_num;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        int num=sc.nextInt();

        int ans=calcFactorial(num);
        System.out.println("factorial of "+num+" = "+ans);
    }
}