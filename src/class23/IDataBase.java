package class23;

public interface IDataBase {
    int age=10;
 void openDataBase(); //public static final by default
    void readData();
    void writeData();
}
class IBM implements IDataBase{

    @Override
    public void openDataBase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the Database");
    }
}