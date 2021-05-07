import java.util.Scanner;
public class Solution12 {
    public static void main(String[] args) {
        try(Scanner obj1=new Scanner(System.in))
        {
            System.out.println("Select 'M' for male and 'F' for Female");
            char a=obj1.next().charAt(0);
            switch (a)
            {
                case 'M':
                System.out.println("The Candidate is a Male");
                break;
                case 'F':
                System.out.println("The Candidate is a Female");
                break;
                default:
                System.out.println("Out of Bounds");

            }        
        }
        
    }
    
}
