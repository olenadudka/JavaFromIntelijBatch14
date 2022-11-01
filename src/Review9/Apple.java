package Review9;

public class Apple extends Fruit{
    String size;
    String taste;
    double price;
    Apple(String name, String shape,String color,String size){
        super(name,shape,color);
        this.size=size;
    }
    Apple(String name, String shape, String color, String taste, double price){
        super(name,shape,color);
        this.taste=taste;
        this.price=price;
    }
    //overloading =methods with same name within same class
    /*
    how to achieve overloading
    1.change number of param
    2.type of param
    we dont care about return typr
    in overloading -method signature MUST BE DIFFERENT
    method signature=name+parameters
     */
    void makeJuice(){
        System.out.println("from "+name+" we can make "+taste+" juice");
    }
    void makeJuice(String fruit){
        System.out.println("We can have juice from "+name+" mixed with "+fruit);
    }
    //this is not overloading -signature is same
//String makeJuice(){}

    public static void main(String[] args) {
        Apple app=new Apple("apple", "circle", "red", "big");
        // app.color ;not visible since it acc mod is private
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);
        app.grow();
        app.haveBenefits();
        System.out.println(Apple.fresh);
        app.makeJuice();
    }

}
