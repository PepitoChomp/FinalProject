import java.util.Scanner;
public class NameGame
{
  public static void main(){
    String[] Names = {"David",null,"Sadkowski"};
//    Names[0]="David";
//    Names[1]="Maurice";
//    Names[2]="Sadkowski";
      
for(int i=0; i<Names.length; i++){
    if(Names[i]==null){
    System.out.println();
    }
   else if(Names[i].equals("Sadkowski")){
    System.out.println(Names[i] + " (That is my last name!)");
    }
    else{
    System.out.println(Names[i]);
    }
}

/*
      Scanner sn = new Scanner(System.in);
    String name = "David";
    System.out.println("What is your name?");
      String nm = sn.next();
    if(name.equals(nm)){
    System.out.println("We have the same name!");
    }
    else{
    System.out.println("We have different names.");
    }
    
*/

}
}