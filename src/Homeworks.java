public class Homeworks {
    public static void main(String[] args) {

        int[] numbers = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};

        for (int i : numbers) {
            System.out.println(i);
        }
        for (int a : numbers) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        for (int d : numbers) {
            if (d % 2 == 1) {
                System.out.println(d);
            }

            for (int b : numbers) {
                if (b % 3 == 0) {
                    System.out.println(b);
                }
            }

        }
        int[] numbers1= {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
        int max = numbers1 [0];
        int min = numbers1 [0];
        for (int c : numbers1) {
            if (c > max) {
                max = c;
            }
        }
        System.out.println("max is " + max);
        for (int e : numbers1) {
            if (e < min){
                min = e;
            }
        }
        System.out.println("min is " + min);

        int[] arrayNumbers = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int index = 0;

        for (int v:arrayNumbers) {
            if(v == 10){
                System.out.println(index);
            }
            index ++;
        }

    }

}



