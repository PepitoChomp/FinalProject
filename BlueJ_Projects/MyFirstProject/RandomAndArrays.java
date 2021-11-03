
public class RandomAndArrays
{
    public static void main(){
        int low =1;
        int high =6;
        int num = (int)(Math.random()*(high-low+1) + low);
        print("Hello, the value is " + num);
        
        int[] myArray = new int[4];
        myArray[0]=22;
        myArray[1]=44;
        myArray[2]=88;
        myArray[3]=176;
        
        print("The array size is " + myArray.length);
        
        for(int i=0; i<myArray.length; i++){
        System.out.println(myArray[i]);
    }
}
    public static void print(String s){
        System.out.println(s);
    }
}
