package repls;

public class repl182 {
    public static void main(String[] args){
        Person person1=new Person("John","Doe", 10,25,1900, "123-45-6789");
        System.out.println(person1.getFirstname());
        System.out.println(person1.getLastname());
        System.out.println(person1.formatBirthday());
        System.out.println(person1.getSssn());
    }

}

class Person{
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthmonth,int birthday, int birthyear, String ssn){
        setFirstname(firstname);
        setLastname(lastname);
        setBirthmonth(birthmonth);
        setBirthday(birthday);
        setBirthyear(birthyear);
        setSsn(ssn);
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setBirthmonth(int birthmonth){
        this.birthmonth=birthmonth;
    }
    public int getBirthmonth(){
        return birthmonth;
    }

    public void setBirthday(int birthday){
        this.birthday=birthday;
    }
    public int getBirthday(){
        return birthday;
    }

    public void setBirthyear(int birthyear){
        this.birthyear=birthyear;
    }
    public int getBirthyear(){
        return birthyear;
    }

    public void setSsn(String ssn){
        this.ssn=ssn;
    }
    public String getSssn(){
        return ssn;
    }
    public String birthdayFormatted=(this.birthmonth+"/"+this.birthday+"/"+this.birthyear);
    public String  formatBirthday(){
        return  birthdayFormatted;
    }


    }


