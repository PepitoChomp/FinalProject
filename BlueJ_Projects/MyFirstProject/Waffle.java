
public class Waffle
{
    // Instance Variable    An instance of a class is an object
    private int diameter;
    private String flavor;
    private boolean isCrispy;
    
    // Zero arguments constructor
    public Waffle(){
        this.diameter=0;
        this.flavor=null;
        this.isCrispy=false;
    }
    //multi argument constrctor
        public Waffle(int diameter, String flavor, boolean isCrispy){
        this.diameter=diameter;
        this.flavor=flavor;
        this.isCrispy=isCrispy;
    }
    // String method that returns info about the object
    public String toString(){
        return "Diameter: " + this.diameter + " Flavor: " + this.flavor + " isCrispy: " + this.isCrispy;
    }
    

}
