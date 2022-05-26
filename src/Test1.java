public class Test1 {
    public static void main(String[] args){
        String[] colors = {"Red", "Orange", "Yellow", "Green"};
        System.out.println(colors[1]);
        colors[1] = "Pink";
        System.out.println(colors[1]);

        double[] temps = {32.2, 45, 65.3, 67, 12.34};
        System.out.println(temps[0]);

        String[] names = new String [10];
        names[0] = "Anna";
        names[1] = "Mary";
        names[2] = "Peter";
        names[3] = "John";
        names[4] = "Vlad";
        names[5] = "Tatiana";
        names[6] = "Max";
        names[7] = "Steve";
        names[8] = "Andrew";
        names[9] = "sofiia";
        System.out.println(names[5]);

        int size = names.length;

        System.out.println(colors.length);

        System.out.println(colors[colors.length -1]);

        boolean[] results = {true, true, false, 89 > 90, 700 == 12, 12!=12, 67>34 && 89!=0};
        System.out.println(results[3]);
        System.out.println(results[0]);
        System.out.println(results[5]);





     }
}
