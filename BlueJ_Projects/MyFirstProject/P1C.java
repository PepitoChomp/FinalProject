import java.util.Scanner;
public class P1C
{
  public static void main(){
    Scanner sn = new Scanner(System.in);
    String School = ("Granada");
    String Mascot = ("Matadors");
    String[] Names = {"Thomas","Oliver","Waldo","Barry",null};

    System.out.println("School?");
    String Sans = sn.next();
    if(School.equals(Sans)){
          System.out.println("Mascot?");
          String Mans = sn.next();
          if(Mascot.equals(Mans)){
                 System.out.println("Correct!");
                 for(int i=0; i<Names.length; i++){
                        if(Names[i]==null){
                            System.out.println("This spot is empty");
                        }
                        else if(Names[i].equals("Waldo")){
                            System.out.println("This spot has Waldo");
                        }
                        else{
                            System.out.println("Spot " + i + " does not have Waldo");
                        }
                    }
                }
            else{
                System.out.println("Mascot is incorrect.");
            }
    }
    else{
        System.out.println("School is incorrect.");
    }
   
    
    

      
    
    
    
    
    
    
    
    
    
    
    
}
}
