import java.util.Scanner;
import java.lang.Math;
public class P1E
{
    public static void main(){
      int low = 100;
      int high = 0;  
      Scanner sn = new Scanner(System.in);
       for(int i=1; i<11; i++){
           int num = (int)(Math.random()* (i*i-i+1)+i);
           
           if(num == i*i){
               System.out.println(i + "\t" + num + "\t" + (i*i)+"\t" + "The random value is equal to the square of the index");
               if(num<low && num>9){
                   low=num;
                }
               if(num>high){
                   high=num;
                }
            }
           else if(num == i){
               System.out.println(i + "\t" + num + "\t" + (i*i)+"\t" + "The random value is equal to the index");
               if(num<low && num>9){
                   low=num;
                }
               if(num>high){
                   high=num;
                }
            }
           else{
               System.out.println(i + "\t" + num + "\t" + (i*i));
               if(num<low && num>9){
                   low=num;
                }
               if(num>high){
                   high=num;
                }
           }
      }
      System.out.println("The lowest two digit random num was " + low);
      System.out.println("The highest random num was " + high);
      System.out.println("Please give me an item for bag 1");
      String a = sn.next();
      System.out.println("Please give me an item for bag 2");
      String b = sn.next();
      System.out.println("Bag 1 has " + a);
      System.out.println("Bag 2 has " + b);
      System.out.println("Would you like to swap?");
      String c = sn.next();
      if(c.equals("yes")){
          String temp = a;
          a=b;
          b=temp;
          
          System.out.println("Bag 1 has " + a);
          
          System.out.println("Bag 2 has " + b);
      }
      else{
          System.out.println("Bag 1 still has " + a);
          System.out.println("Bag 2 still has " + b);
      }
   }
}