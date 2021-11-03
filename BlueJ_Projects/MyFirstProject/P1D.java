import java.util.Scanner;
public class P1D
   {
    public static void main(){
       Scanner sn = new Scanner(System.in);
       System.out.println("Please give a number between 10 and 20 inclusive:");
       int leng = sn.nextInt();
       while(leng>20 || leng<10){
           System.out.println("ERROR! Please give a number between 10 and 20 inclusive:");
           leng = sn.nextInt();    
       }                        
       System.out.println("Please enter 'same' if you want the numbers on the same line or 'different' if you want them on different lines:");
       String line = sn.next();
       while(!line.equals("same") && !line.equals("different")){ 
           System.out.println("ERROR! Please enter 'same' if you want the numbers on the same line or 'different' if you want them on different lines:");
           line = sn.next(); 
       }     
       int low =90;
       int high =100;
       int[] myArray = new int[leng];
       if(line.equals("same")){
           System.out.println("Choose a character to seperate the numbers");
           String character = sn.next();
            for(int i=0; i<myArray.length; i++){
                myArray[i] = (int)(Math.random()*(high-low+1) + low);
                if(i==myArray.length-1){
                System.out.print((myArray[i]));
                }
                else{
                System.out.print((myArray[i]) + character);
                }
       }
       }
       if(line.equals("different")){
            for(int i=0; i<myArray.length; i++){
                myArray[i] = (int)(Math.random()*(high-low+1) + low);
                System.out.println((myArray[i]));
        }
       }
    }
}