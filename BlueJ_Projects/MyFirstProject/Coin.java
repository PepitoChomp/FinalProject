
public class Coin
{
   private int value;
   private String material;
   public Coin(int value, String material){
       this.value=value;
       this.material=material;
   }
   public int getValue(){
       return this.value;
   }
   public String getMaterial(){
       return this.material;
   }
   public void setValue(int value){
       this.value=value;
   }
   public void setMaterial(String material){
       this.material=material;
   }
   public boolean biggerThanDime(){
       /*if(this.value>10){
           return true;
       }
       else{
           return false;
       }*/
       return this.value>10;
   }
}
