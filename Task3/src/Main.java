import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Allan", new ArrayList<>());
        Student b = new Student("Benny", new ArrayList<>());
        Student c = new Student("Carla", new ArrayList<>(Arrays.asList("Java 1.0")));

        String data = "Datamatiker";
        String hyggefag = "Hyggefag";
        String frikvarter = "Frikvarter";

        ArrayList<String> courses = new ArrayList<>(Arrays.asList(data, hyggefag, frikvarter));

        Teacher t1 = new Teacher("Alfred", new ArrayList<>(Arrays.asList(data, hyggefag, frikvarter)));
        courses.add("Java 1.0");
        Teacher t2 = new Teacher("Ole", courses);


        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(a,b,c,t1,t2));

        for (Person p: persons) {
            for(String s : courses){
                if(!p.addCourse(s)){
                    switch(p.getClass().getSimpleName()){
                        case "Student" :
                            System.out.println(p.getName() + " har allerede bestået dette kursus.");
                            break;
                        case "Teacher" :
                            System.out.println(p.getName() + " kan ikke undervise i dette fag");
                            break;
                    }
                }
            }
        }



    }
}