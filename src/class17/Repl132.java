package class17;

public class Repl132 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

           for(int[] arr:a){
               for(int single: arr){
                   System.out.print((single-10)+" ");
               }
               System.out.println();
           }

        }

    }

