import java.util.Scanner;
public class Solution10 {
    
    public static void main(String[] args) 
    {
        try(Scanner obj=new Scanner(System.in))
        {
            int temp,r=0,sum=0;
            System.out.println("Enter a number");
            int a=obj.nextInt();
            temp=a;
            if(a>=0&&a<=10)
            {
                System.out.println("not a palindrome");
            }
            else
            {
                while(a>0)
                {
                    r=a%10;
                    sum=r+(sum*10);
                    a=a/10;
                }
                if(temp==sum)
                {
                    System.out.println(sum+" is a palindrom");
                }
                else{

                    System.out.print(sum+"is not a palindrom ");
                   // System.out.println();

                }
            }
        }
        
    }
}
