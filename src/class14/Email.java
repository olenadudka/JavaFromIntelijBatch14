package class14;

public class Email {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) →
    // johnsnow@gmail.com or
    void createEmail(String userName,String lastName, String emailType) {
        System.out.println(userName.toLowerCase()+lastName.toLowerCase()+"@"+emailType+".com");
    }

    public static void main(String[] args) {
        Email comb=new Email();
        comb.createEmail("Olena","Dudka","yahoo" );
    }

}
