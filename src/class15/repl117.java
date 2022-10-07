package class15;

public class repl117 {
    int sum = 0;

    int sumEvenToX(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sum = i + sum;
            }

        }
        return sum;
    }

        public static void main (String[] args){
            repl117 result = new repl117();
            System.out.println(result.sumEvenToX(8));

        }

}