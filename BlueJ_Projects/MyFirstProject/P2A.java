import java.util.Scanner;
public class P2A
{
   public static void main(){
       Scanner sn = new Scanner(System.in);
       
       System.out.println("What is your first name?");
       String firstU = sn.next();
       System.out.println("What is your middle name?");
       String middleU = sn.next();
       System.out.println("What is your last name?");
       String lastU = sn.next();
       
       String[] namesU = new String[3];
       namesU [0] = firstU;
       namesU [1] = middleU;
       namesU [2] = lastU;
       
       System.out.println("What is your friends first name?");
       String firstF = sn.next();
       System.out.println("What is your friends middle name?");
       String middleF = sn.next();
       System.out.println("What is your friends last name?");
       String lastF = sn.next();
       
       String[] namesF = new String[3];
       namesF [0] = firstF;
       namesF [1] = middleF;
       namesF [2] = lastF;
       
       int totalU = 0;
       int totalF = 0;
       
       for(int i=0; i<namesU.length; i++){
           totalU += namesU[i].length();
           
       }
       for(int i=0; i<namesF.length; i++){
           totalF += namesF[i].length();
           
       }
       if(totalU>totalF){
           System.out.println("Your name is longer than your friends name.");
       }
       else if(totalF>totalU){
           System.out.println("Your friends name is longer than your name.");
       }
       else if(totalU==totalF){
           System.out.println("Your name is the same length as your friends name.");
       }
       
       System.out.println("How old are you?");
       int ageU = sn.nextInt();
       System.out.println("How old is your friend?");
       int ageF = sn.nextInt();
       System.out.println("How old is person?");
       int ageP = sn.nextInt();
       System.out.println("What is person's first name?");
       String firstP = sn.next();
       System.out.println("What is person's middle name?");
       String middleP = sn.next();
       System.out.println("What is person's last name?");
       String lastP = sn.next();
       Person p1 = new Person(firstP,middleP,lastP,ageP);
       System.out.println(p1.toString());
   }
}
