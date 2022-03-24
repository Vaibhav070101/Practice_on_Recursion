import java.util.Scanner;
public class power{
    public static int findPower(int base, int pow){
        if(base == 1 || pow == 0){
            return 1;
        }
        return base*findPower(base, pow-1);
    }
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int num=sc.nextInt();
        System.out.print("Enter the power : ");
        int p=sc.nextInt();

        System.out.println(findPower(num, p));
    }
}