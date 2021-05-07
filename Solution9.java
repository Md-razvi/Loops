import java.util.Scanner;
public class Solution9 
{

    public static void main(String[] args) 
    {
        try(Scanner obj=new Scanner(System.in))
        {
            int m=0,flag=0;

            System.out.println("Enter the number");
            int a=obj.nextInt();
            m=a/2;
            if(a==0||a==1)
            {
                System.out.println("It is not a prime");
            }
            else
            {
                for(int i=2;i<=m;i++)
                {
                    if(a%i==0)
                    {
                        System.out.println("Prime number");
                        flag=1;
                        break;
                    }  
                }
                if(flag==0)
                {
                    System.out.println(m);
                    System.out.println("not a prime number");
                }

            }

        

        }
    }
}

