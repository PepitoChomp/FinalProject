import java.util.Scanner;
public class Sus
{
    public static void main(){
        Scanner susDetector = new Scanner(System.in);
        boolean isSus;
        System.out.println("Do you like the color red?");
        String susAns = susDetector.next();
        if(susAns.toLowerCase().equals("yes")){
            isSus=true;
        }
        else{
            isSus=false;
        }
        if(isSus==true){
            System.out.println("You are sus...");
        }
        else if(isSus==false){
            System.out.println("No sus was detected...");
        }
    }   
}
