
public class FridgeDriver
{
    public static void main(){
        Cheese[] cheeseArr = {new Cheese(50), new Cheese(57), new Cheese(18), new Cheese(21)};
        Fridge f1 = new Fridge(cheeseArr);
        
        int min = f1.getNewestCheeseAge();
        
        System.out.println("Youngest cheese is: "+min);
    }
}
