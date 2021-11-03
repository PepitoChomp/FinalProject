
public class P3A
{
    public static void main(){
        Song s1 = new Song(300, "Hooked On A Feeling");
        System.out.println(s1.convertMinToSecs());
        s1.setLengthInSecs(343);
        System.out.println(s1.convertMinToSecs());
        System.out.println(s1.toString());
    }
}
