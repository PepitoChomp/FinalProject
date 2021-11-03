
public class Car
{
    String make;
    int mpg;
    boolean isInStock;
    public Car(String make, int mpg, boolean isInStock){
        this.make=make;
        this.mpg=mpg;
        this.isInStock=isInStock;
    }
    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make=make;
    }
    public int getMpg(){
        return this.mpg;
    }
    public void setMpg(int mpg){
        this.mpg=mpg;
    }
    public boolean getStockStatus(){
        return this.isInStock;
    }
    public void setStockStatus(boolean isInStock){
        this.isInStock=isInStock;
    }
}
