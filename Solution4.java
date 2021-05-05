import java.util.Scanner;
public class Solution4
{
    public static void main(String[] args)
    {
        try(Scanner obj=new Scanner(System.in))
        {
            System.out.println("Enter the your range : ");
            int a=obj.nextInt();
            System.out.println("\tEVEN NUMBERS\t");
            for(int j=1;j<=a;j++)
            {
                if(j%2==0)
                System.out.println("  \t"+j);
            }
            System.out.println("\tODD NUMBERS\t");
            for(int j=1;j<=a;j++)
            {
                if(!(j%2==0))
                System.out.println("  \t"+j+" ");
            }
        }
    }
}