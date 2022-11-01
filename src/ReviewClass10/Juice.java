package ReviewClass10;
class Drink{
    void Drink(){
        System.out.println("Drinking method");
    }
    //final methods can't be overriden
    protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }
}



//CE: the type Juice cnt subclass a final class Drink
//public class Juice extends Drink {
    /*CE can't override final method
    @Override
    public void enjoy() {
        System.out.println("we enjoy drinking juice");
    }*/


