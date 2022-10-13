package repls;

public class repl152 {
}

class Parent{

        String city;
        Parent(String city){
            this.city=city;
            System.out.println(city);
        }

        Parent(){
            System.out.println("Parent constructor");
        }
    }

    class Child extends Parent{
  Child(){
      super("Vienna");
  }


    }

    class Main{
        public static void main(String[] args) {
            Child obj=new Child();
        }
    }