import java.lang.Math;
public class P2D
{
    public static void main(){
        Student[] femaleStudents = new Student[7];
        femaleStudents[0] = new Student(9,"Allison");
        femaleStudents[1] = new Student(12,"Barbara");
        femaleStudents[2] = new Student(11,"Candace");
        femaleStudents[3] = new Student(9,"Deb");
        femaleStudents[4] = new Student(12,"Erika");

        Student[] maleStudents = new Student[7];
        maleStudents[0] = new Student(11,"A-a-ron");
        maleStudents[1] = new Student(12,"B-lak-e");
        maleStudents[2] = new Student(9,"Charles");
        maleStudents[3] = new Student(10,"Doug");
        maleStudents[5] = new Student(12,"Freddy");
        
        String[] olderNames = new String[7];
        System.out.println("Female Name" + "\t" + "Grade" + "\t" + "Male Name" + "\t" + "Grade" + "\t" + "Older Student");
        for(int i=0; i<olderNames.length; i++){
            if(femaleStudents[i]==null&&maleStudents[i]==null){
                olderNames[i]="Space for Rent";
                System.out.println("null" + "\t" + "null" + "\t" + "null" + "\t" + "null" + "\t" + olderNames[i]);
            }            
            else if(maleStudents[i]==null){
                olderNames[i]=femaleStudents[i].getName();
                System.out.println(femaleStudents[i].getName() + "\t" + femaleStudents[i].getAge() + "\t" + "null" + "\t" + "null" + "\t" + olderNames[i]);
            }
            else if(femaleStudents[i]==null){
                olderNames[i]=maleStudents[i].getName();
                System.out.println("null" + "\t" + "null" + "\t" + maleStudents[i].getName() + "\t" + maleStudents[i].getAge() + "\t" + olderNames[i]);
            }
            else{
                if(femaleStudents[i].getAge()==maleStudents[i].getAge()){
                    int rand = (int)(Math.random()*((2-1+1)+1));
                    if(rand==1){
                        olderNames[i]=femaleStudents[i].getName();
                     }
                    else{
                        olderNames[i]=maleStudents[i].getName();
                    }
                    }
                    else if(femaleStudents[i].getAge()>maleStudents[i].getAge()){
                        olderNames[i]=femaleStudents[i].getName();
                    }
                    else if(maleStudents[i].getAge()>femaleStudents[i].getAge()){
                        olderNames[i]=maleStudents[i].getName();
                    }
                System.out.println(femaleStudents[i].getName() + "\t" + femaleStudents[i].getAge() + "\t" + maleStudents[i].getName() + "\t" + maleStudents[i].getAge() + "\t" + olderNames[i]);
            }
        }   
    }
}
