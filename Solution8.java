import java.util.Scanner;
public class Solution8 {
    public static void main(String[] args) {
        try(Scanner obj=new Scanner(System.in))
        {
            System.out.println("Enter the given number:");
            int a=obj.nextInt();
            int copy=a;
            int sum=0;
            while(a!=0)
            {
                int remainder=a%10;
                int cube=remainder*remainder*remainder;
                sum+=cube;
                a/=10;        
            }
            if(sum==copy)
            {
                    System.out.println("The number "+sum+" is an armstrong");
            }
            else
            {
                System.out.println("It is not an armstrong");
            }
        }
    }
}
