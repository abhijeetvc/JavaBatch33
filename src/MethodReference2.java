//  b) Reference to an instance method of particular object

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReference2 {

    public static void main(String[] args) {

        Student s1=new Student();
        s1.setId(1);
        s1.setName("A");
        s1.setAge(35);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("B");
      //  s2.setAge(30);

        List<Student> stuList=new ArrayList();
        stuList.add(s1);
        stuList.add(s2);

        CompareStudents cs=new CompareStudents();

        //java 8 lambda expression
     //   stuList.sort((s3,s4)->cs.compareByAge(s3,s4));

        //method reference
        stuList.sort(cs::compareByAge);
        stuList.forEach(a-> System.out.println(a));

    }
}

class CompareStudents{
    public int compareByAge(Student s1,Student s2){
        return s1.getAge()-s2.getAge();
    }
}
