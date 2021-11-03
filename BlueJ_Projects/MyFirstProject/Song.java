
public class Song
{
    private String name;
    private int lengthInSecs;
    Song(int lengthInSecs, String name){
        this.lengthInSecs=lengthInSecs;
        this.name=name;
    }
    public int getLengthInSec(){
        return lengthInSecs;
    }
    public void setLengthInSecs(int lengthInSecs){
        this.lengthInSecs=lengthInSecs;
    }
    public String convertMinToSecs(){
                int lengthInMins=lengthInSecs/60;
                int lengthInSecs=this.lengthInSecs%60;
                return "The length of the song is " + lengthInMins + " minutes and " + lengthInSecs + " seconds.";
    }
    public String toString(){
        return "Name: " + name + "\t" + convertMinToSecs();
    }
}
