import java.util.Scanner;
public class Solution11 {
    public static void main(String[] args) 
    {
        try(Scanner obj=new Scanner(System.in))
        {
            System.out.println("Enter the number:");
            int a=obj.nextInt();
            switch(a%2)
            {
                case 0:
                System.out.println("EVEN");
                break;
                case 1:
                System.out.println("ODD");
                break;
                
            }


        }
    }
}
