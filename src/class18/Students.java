package class18;

public class Students {
    /*
    Write a Student class   that have instance variables name and address. Create a constructor that
    will initialize those variables. Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    public Students(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void DisplayInfo(){
        System.out.println("Student name is "+name+" and address is "+address);
    }

    public static void main(String[] args) {
        new Students("Dmitriy", "Virginia Beach, 400 Shore drive").DisplayInfo();
    }


}
