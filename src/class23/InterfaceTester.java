package class23;

public class InterfaceTester {
    public static void main(String[] args) {


        IDataBase iDataBase = new IBM();
        iDataBase.openDataBase();
        iDataBase.readData();
        iDataBase.writeData();
    }
}