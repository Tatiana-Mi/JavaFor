
public class Functions{
    public static void sum (int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        sum(4, 5);
        sum(3, 7);
        sum(1, 9);

        System.out.println(sum2(21, 34));
        System.out.println(sum2(45, 67));
        System.out.println(sum2(97, 35));

        boolean res = isEven(5);
        System.out.println(res);
        System.out.println(isEven(6));
        System.out.println(isEven(8));
        System.out.println(isEven(1));

    }
    public static int sum2(int c, int d){
        return c + d;
    }

    public static boolean isEven(int x){
        return x%2 ==0;

    }

}