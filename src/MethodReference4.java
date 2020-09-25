//d) Reference to constructor

interface DisplayData{
    Data getData(String data);
}

class Data{
    Data(String str){
        System.out.println(str);
    }
}

public class MethodReference4 {

    public static void main(String[] args) {
        DisplayData d=Data::new;
        d.getData("Abhijeet");
    }
}
