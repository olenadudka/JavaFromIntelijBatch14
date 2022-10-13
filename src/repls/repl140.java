package repls;

public class repl140 {


       public static String maxLength(String[] arr){
           int index=0;
           int maxLength = arr[0].length();
           for (int i = 0; i < arr.length; i++){
               if(arr[i].length()>maxLength){
                   index=i;
                   maxLength=arr[i].length();
               }
            }return arr[index];
       }




   public static void main(String[] args) {

          String[] arr = {"hey", "yolo", "hi", "this is long"};
        String a = maxLength(arr);
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}

