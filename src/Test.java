public class Test {
    public static void main (String[] args){
        String name = "Tanya";
        String lastName = "Mi";
        double Temp = 85.5;
        int Age = 38;
        char Char = 'A';
        System.out.println("Hello, my name is " + name);
        System.out.println("Hello, my lastname is " + lastName);
        System.out.println("I am " + Age + " years old");
        System.out.println("My favorite letter is " + Char);
        System.out.println("It's hot outside. Almost " + Temp + " F degree");

        int[] num = {2, 76, 87, 12, 34, 21, 9, 143};
        num[0] = 26;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        System.out.println(num[7]);
        System.out.println(num[2]);

        String[] months = new String[5];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";

        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);

        boolean[] num1 = {1>2, 2<1, 5!=7, 6==6,15<3 && 2>1, 4<5 || 5>9 };
        System.out.println(num1[0]);
        System.out.println(num1[1]);
        System.out.println(num1[2]);
        System.out.println(num1[3]);
        System.out.println(num1[4]);
        System.out.println(num1[5]);






    }
}
