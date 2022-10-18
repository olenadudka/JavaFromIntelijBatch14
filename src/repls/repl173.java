package repls;

public class repl173 {

    public static void main(String[] args){
        Tea[] tea={new LemonTea("Lemon Tea"), new ChaiTea("Chai Tea")};
        for(Tea types:tea){
           types.addSugar();
        }
    }
}

abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract  void addSugar();
}
class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+"  we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+"  we need 2 spoons of sugar");
    }
}
