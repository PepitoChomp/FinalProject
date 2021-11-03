import java.util.Scanner;
public class While
{
    public static void main(){
        /*
        int num = 1;
        while(num<41){
            System.out.println(num);
            num++;
        }
        System.out.println("loop completed successfully");
        */
        Scanner sn = new Scanner(System.in);
        System.out.println("Insert Age Here:");
        int age = sn.nextInt();
        while(age>120){
            System.out.println("That is impossible...");
            System.out.println("Insert Age Again:");
            age = sn.nextInt();
        
        }
        if(age<120){
            System.out.println("Age Accepted.");
        
        
        }
       
       
    }
}
