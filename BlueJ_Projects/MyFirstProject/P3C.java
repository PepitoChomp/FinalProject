import java.util.Scanner;
public class P3C
{
    public static void main(){
        String state = "california";
        String city = "livermore";
        String stateAns="";
        String cityAns="";
        Scanner sn = new Scanner(System.in);
        while(!stateAns.equals(state)){
            System.out.println("What state are you in?");
            stateAns = sn.next();
            stateAns = stateAns.toLowerCase();
            if(stateAns.compareTo(state)>0){
                System.out.println("Your state is later in the alphabet than the hometown state.");
            }
            else if(stateAns.compareTo(state)<0){
                System.out.println("Your state is earlier in the alphabet than the hometown state.");
            }
        }
        while(!cityAns.equals(city)){
            System.out.println("What city are you in?");
            cityAns = sn.next();
            cityAns = cityAns.toLowerCase();
            if(cityAns.compareTo(city)>0){
                System.out.println("Your city is later in the alphabet than the hometown state.");
            }
            else if(cityAns.compareTo(city)<0){
                System.out.println("Your city is earlier in the alphabet than the hometown state.");
            }
        }
        String password="";
        System.out.println("Please enter a password:");
        password=sn.next();
        boolean symbol = password.contains("+") || password.contains("-") || password.contains("*") || password.contains("@");
        boolean lengthpass = password.length()>=6;
        while(lengthpass==false||symbol==false){
            System.out.println("Try again: Please enter a password:");
            password=sn.next();
            lengthpass = password.length()>=6;
            symbol = password.contains("+") || password.contains("-") || password.contains("*") || password.contains("@");
            }
        }
    }
  
