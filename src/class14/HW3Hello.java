package class14;

public class HW3Hello {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed
    String method(String country){
        if(country.equals("USA")){
            return "Hello";
        }else if(country.equals("Ukraine")){
return "Dobrogo dnya";
    }else if (country.equals("Spain")){
            return "Hola";
        }else if(country.equals("Russia")) {
            return "Privet";
        } else if(country.equals("France")){
                return "Bonjour";
            }else{
            return "Try different country";
        }
        }


    public static void main(String[] args) {
        HW3Hello hello=new HW3Hello();
        System.out.println(hello.method("Spain"));
    }

}
