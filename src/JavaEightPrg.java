import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

interface MyInterface1{
    void display();
}

interface MyInterface2 extends MyInterface1{
    void display1();
}

public class JavaEightPrg {

    public static void main(String[] args) {

        //Function
        Function<String,Integer> f=str->str.length();
        Function<Integer,Integer> f1=val->val*10;
        Integer i=f.andThen(f1).apply("Abhijeet");
        System.out.println("Value of f1 is : "+i);

        //BiFunction
        BiFunction<Integer,Integer,Integer> f2=(a,b)->a+b;
        Integer i1=f2.apply(20,30);
        System.out.println("Addition is: "+i1);

        //BinaryOperator
        BinaryOperator<Integer> f3=(x,y)->x+y;
        Integer i2=f3.apply(40,50);
        System.out.println("Result is: "+i2);

        //UnaryOperator
        UnaryOperator<Integer> f4=y->y*5;
        Integer i3=f4.apply(10);
        System.out.println("Result1 is: "+i3);

        //Predicate

        List<String> list= Arrays.asList("India","US","China","France","Germany");

//        for (String s:list) {
//            System.out.println(s);
//        }

        list.forEach(a-> System.out.println(a));

        List<Integer> list1=Arrays.asList(5,10,15,20,25,30);
        Predicate<Integer> p=x->x>10;
        List<Integer> list3=list1.stream().filter(p).collect(Collectors.toList());
        System.out.println(list3);

        //BiPredicate
        BiPredicate<String,Integer> f5=(p1,q1)->{
            return p1.length()==q1;
        };
        boolean check=f5.test("Abhi",4);
        System.out.println("Boolean flag is : "+check);

        //Consumer
        Consumer<String> f6=str-> System.out.println(str);
        f6.accept("India");

        //BiConsumer
        BiConsumer<Integer,Integer> f7=(a1,b1)-> System.out.println(a1+b1);
        f7.accept(25,35);
    }
}
// Implementation of the BiFunction chaining
// Implementation of BinaryOperator with String input
//  type(e.g firstname and lastname with output as concatenation)
// Implementation of predicate for filtering countries other than china

//Date: 22/09/2020
// a) Comparable Interface using Java 8 style
//     --> Implement the object comparison using the normal java style with comparable interface.
//     --> Then implement same logic using the lambda expression