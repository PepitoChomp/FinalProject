public class Student
{
    private int age;
    private String name;
    public Student(){
        this.age=0;
        this.name=null;
    }
    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
