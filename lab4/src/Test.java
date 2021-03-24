/**
 * Created by pc on 2/18/2021.
 */
public class Test {
    public static void main(String[] args) {
        Person person ;
        Student student = new Student("Manal",19,12);
        person = student;           //widening cast.
        System.out.println(person);

        Person person1 = new Person("Ebtsam",22);


        if (person1 instanceof Student)        //handling cast exception .
        {
            Student student1 ;
            student1 = (Student) person1;       //narrowing cast . it is not save.
            System.out.println(student1.toString());
        }

        Person person2 = new Student("Fatima",23,14);
        if (person2 instanceof Student)        //handling cast exception .
        {
            Student student1 ;
            student1 = (Student) person1;       //narrowing cast . it is not save.
            System.out.println(student1.toString());
        }

    }
}
