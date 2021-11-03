import java.util.Scanner;
public class P2B
{
  public static void main(){
      Scanner sn = new Scanner(System.in);
      
      System.out.println("What is your low value?");
      int low = sn.nextInt();
      System.out.println("What is your high value?");
      int high = sn.nextInt();
      if(low>high) {
          System.out.println("ERROR! Your low value is higher than high value.");
    }
    else{
        System.out.println("How long do you want the array to be?");
        int length = sn.nextInt();
        int[] myArray = new int[length];
        for(int i=0; i<myArray.length; i++){
             myArray[i] = (int)(Math.random()*(high-low+1) + low);
    }
    int evens = 0;
        for(int i=0; i<myArray.length; i++){
        if(myArray[i]%2==0){
            System.out.println("Number " + (i+1) + " is " + myArray[i] + " which is even.");
            evens = evens + 1;
    }
    else{
        System.out.println("Number " + (i+1) + " is " + myArray[i] + " which is odd.");
    }
        
    }
    if(evens == 1){
        System.out.println("There is " + evens + " even and " + (length-evens) + " odds.");
    }
    else{
        System.out.println("There are " + evens + " evens and " + (length-evens) + " odds.");
    }
    
}
}
}
