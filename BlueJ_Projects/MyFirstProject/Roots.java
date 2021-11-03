import java.util.Scanner;
import java.lang.Math;
public class Roots
{
    public static void main(){
        Scanner sn = new Scanner(System.in);
        
    System.out.println("What is the value of a?");
        
        int a = sn.nextInt();

    System.out.println("What is the value of b?");
        
        int b = sn.nextInt();
        
    System.out.println("What is the value of c?");
        
        int c = sn.nextInt();
        
    System.out.println("B squared is " + (b * b));
    
    System.out.println("4 times a times c is " + (4 * a * c));
    
        double answer1 = ((-b+Math.sqrt(b * b - 4 * a * c))/(2 * a));
        double answer2 = ((-b-Math.sqrt(b * b - 4 * a * c))/(2 * a));
        
    if (b * b - 4 * a * c < 0)
    {
        System.out.print("Error cannot calculate");
    }
    else{
    System.out.println("The square root of b^2-4ac is " + Math.sqrt(b * b - 4 * a * c));
    System.out.println("X equals " + answer1);
    System.out.println("X equals " + answer2);
}
}
}
