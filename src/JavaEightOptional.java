import java.util.Optional;

public class JavaEightOptional {
    public static void main(String[] args) {

        Optional<String> gender= Optional.of("Male");

        Optional<String> noValue=Optional.empty();
//        if(gender.isPresent()){
//            System.out.println("Value is present");
//        }
        if(noValue.isPresent()){
            System.out.println("Value available");
        }

        gender.ifPresent(s-> System.out.println("Value is available"));
    }
}
// Optional<Employee> emp=repo.findById(id);
// if(emp.isPresent()){
// emp.setName("Abhi");
//  return "Data updated"
//}
 // return "Something went wrong";