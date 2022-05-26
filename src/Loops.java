public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("============");
            System.out.println("Hey");
            System.out.println("How are you?");
            System.out.println();

            //While loop

            int j = 0;
            while (j < 5) {
                System.out.println(j);
                j++;
            }

            //Do/while loop

            int a = 0;
            do {
                System.out.println(a);
                a++;
            }
            while (a < 1);

            //For loop

            for (int b = 10; b > 0; b = b - 3) {
                System.out.println(b);
            }

            int[] age = {12, 2, 4, 6, 89, -10};
            for (int c : age) {
                System.out.println(c);
            }

            int[] numbers = {12, 21, 4, 6, 89, -10};


            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }

            }
            for (int number : numbers) {
                if (number % 2 == 1 || number % 2 == -1) {
                    System.out.println(number);
                }
            }

            int[] students = {4, 2, 6, 8, 89, -9, 0};

            int max = students[0];
            int min = students [0];

            for (int n : students) {
                if (n > max) {
                    max = n;
                }
            }
            System.out.println("max is " + max);

            for (int m : students) {
                if(m < min){
                    min = m;
                }
            }
            System.out.println("min is " + min);

        }

    }
}


