//c) Reference to an instance method of an arbitrary object of particular type.

import java.util.Arrays;

public class MethodReference3 {

    public static void main(String[] args) {
        String[] countries={"India","US","France","Germany"};

        Arrays.sort(countries,String::compareToIgnoreCase);
        for (String str:countries) {
            System.out.println(str);
        }
    }
}
