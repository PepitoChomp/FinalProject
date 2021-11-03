
public class Person
{
    private String firstP;
    private String middleP;
    private String lastP;
    private int ageP;
    public Person()
    {
        this.firstP=null;
        this.middleP=null;
        this.lastP=null;
        this.ageP=0;
    }
    public Person(String firstP, String middleP, String lastP, int ageP){
        this.firstP=firstP;
        this.middleP=middleP;
        this.lastP=lastP;
        this.ageP=ageP;
    }
    public String toString(){
        return "Person's name is " + this.firstP +  " " + this.middleP + " " + this.lastP + " and they are " + this.ageP + " years old.";
    }
}
