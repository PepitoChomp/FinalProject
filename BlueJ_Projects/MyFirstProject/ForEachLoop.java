
public class ForEachLoop
{
    public static void main(){
        String[] strArr = {"Joey","Yoav","Takumi"};
        
        // changes values
        for(String name: strArr){
            name="Jennie";
            System.out.println(name);
        }
        
        // origional values used again
        for(String friends: strArr){
            System.out.println(friends);
        }
        
        // for each loop can not modify an array
    }
}
