
public class Fridge
{
    private Cheese[] cheeseArr;
    public Fridge(Cheese[] cheeseArr){
        this.cheeseArr=cheeseArr;
    }
    public int getNewestCheeseAge(){
        if(this.cheeseArr.length==0){
            return -1;
        }
        else{
            int min=this.cheeseArr[0].getAge();
            for(Cheese cheese: cheeseArr){
                if(cheese.getAge()<min){
                    min=cheese.getAge();
                }
            }
            return min;
        }
    }
}
