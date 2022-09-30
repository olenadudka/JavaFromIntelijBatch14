package rewiewClass6;

public class StringMethods1 {
    public static void main(String[] args) {
        //trim() returns a string without leaded spaces
        String textFromApp=" Enroll today ";
        String textFromUserStory="Enroll today";
        if(textFromApp.trim().equals(textFromUserStory)){
            System.out.println("Text is matched.Test pass");
        }else {
            System.out.println("Text is tot matched.Test Failed");
        }
        System.out.println(textFromApp.trim());
        System.out.println(textFromApp);

        //substring
        String str="Hello Class";
       String part2= str.substring(6);//Class
        System.out.println(part2);
        String part1=str.substring(0,5); //Hello
        System.out.println(part1);

        //concat
      String newString=  part1.concat(" ").concat(part2);
      System.out.println(newString);
        System.out.println(part1+part2);
//some examples
        char single=newString.substring(6).charAt(0);
        System.out.println(single); //C
        //newString.charAt(0).substring(6);Compailer error


        //replace();
        String myString="Today is September";
       myString= myString.replace("September", "October");
        System.out.println(myString);
        myString=myString.replace('T','t');
        System.out.println(myString);

        //split();
        String myStr="Today is a review class";
        String[] array=myStr.split(" ");
        System.out.println(array.length); //5
        System.out.println(array[3]);//review
        for(int i=0; i<array.length; i++){
        System.out.println(array[i]);}
        //other way
        for(String arr:array){
            System.out.println(arr);
        }
        //how would you reverse
    }
}
