package repls;

public class repl151 {
    class Method {
        int[][] a;

        int sumArray(int[][] a) {
            int sum = 0;
            for (int[] arr : a) {
                for (int num : arr)
                    sum = sum + num;
            }
            return sum;
        }
    }
}

