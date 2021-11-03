
public class WafffleDriver
{
    public static void main(){
        Waffle w1 = new Waffle(4,"Chocolate Chip",false); // Creates one waffle object
        Waffle w2 = new Waffle(8,"Blueberry",true);
        Waffle w3 = new Waffle(16,"Plain",true);
        
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
    }
}
