package class19;

public class userName {

    String name;
    int number;
   public userName(String name, int number){
       this.name=name;
       this.number=number;
   }}

   class userInfo extends userName{
       String userAddress;
       public userInfo(String name, int number, String userAddress){
           super(name, number);
           this.userAddress=userAddress;
   }
   void userDetails(){
       System.out.println("Name is "+name+" phone number is "+number+" address is "+userAddress);
   }

}
class userTest{
    public static void main(String[] args) {
        userInfo info=new  userInfo("Alex", 454852854, "Virginia beach");
        info.userDetails();
    }
}
