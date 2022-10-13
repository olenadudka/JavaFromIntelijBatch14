package repls;

public class repl141 {

       public static int maxValue(int[]arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }   return maxValue;}


            public static void main(String[] args){
                repl141 task=new repl141();
                int[] arr = {5, 12, -3, 7, 3, 22};

                System.out.println(maxValue(arr));

            }}