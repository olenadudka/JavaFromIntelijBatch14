package reviewClass13;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {
    //create a method that returns a map of characters and their count in a String
    public static void main(String[] args) {
        String str = "hglhgkgkjgkjghkjhg";
        System.out.println(getCount(str));
    }

    public static Map<Character, Integer> getCount(String str) {
        //1 convert String to Array of characters
        char[] charArr = str.toCharArray();
        //create map to store inf
            Map<Character, Integer> map=new HashMap<>();
        //we need a loop
        for(char c:charArr){
          if(map.get(c)==null)  {
              map.put(c,1);
          }else{
              int count=map.get(c);
              count=count+1;
              map.put(c, count);
          }
        }
        return map;
    }
    }

