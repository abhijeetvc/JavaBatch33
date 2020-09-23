//Method Reference: (::) double colon operator

// 4 types of method references:
//  a) Reference to a static method
//  b) Reference to an instance method of particular object
//  c) Reference to an instance method of an arbitrary object of particular type.
//  d) Reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

    static void display(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","US","France","Germany");
        //java 8 lambda expression
        list.forEach(s->MethodReference1.display(s));

        //method reference
        list.forEach(MethodReference1::display);
    }
}
