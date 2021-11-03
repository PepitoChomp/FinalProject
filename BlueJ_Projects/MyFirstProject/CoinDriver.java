
public class CoinDriver
{
    public static void main(){
        Coin c1 = new Coin(25,"Silver");
        Coin c2 = new Coin(5,"Nickel");
        
        System.out.println("Coin1 is larger than a dime? " + c1.biggerThanDime());
        System.out.println("Coin2 is larger than a dime? " + c2.biggerThanDime());
        System.out.println("Material of coin 1 is " + c1.getMaterial());
        System.out.println("Value of coin 2 is " + c2.getValue());
        c1.setMaterial("Copper");
        c2.setValue(1);
        System.out.println("Material of coin 1 is " + c1.getMaterial());
        System.out.println("Value of coin 2 is " + c2.getValue());
        
        Coin[] coinArray = new Coin[5];
        coinArray[0]=c1;
        coinArray[1]=c2;
        coinArray[3]=new Coin(1,"Copper");
        coinArray[4]=new Coin(10,"Silver");
        
        int totalValue=0;
        
        for(int i=0; i<coinArray.length; i++){
            if(coinArray[i]!=null && i%2==0){
                coinArray[i].setValue(2*coinArray[i].getValue());
            }
            if(coinArray[i]!=null){
                totalValue+=coinArray[i].getValue();
            }
        }
        
        System.out.println("My collection is worth " + totalValue + " cents.");
        
    }
}
