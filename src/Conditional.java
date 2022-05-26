public class Conditional {
    public static void main(String[] args){
        int age = 20;

        if(age>=21){
            System.out.println("Here is your candy");
        }else{
            System.out.println("Not today");
        }
        int time = 20;
        String result = (time < 25) ? "Hello!" : "Good bye";
        System.out.println(result);

        int x = 9;
        int y = 5;
        System.out.println(x > y);

        System.out.println(5 > 8);

        int a = 5;
        System.out.println(a == 5);

        System.out.println(5 == 8);

        int Age = 13;
        if(Age <= 2){
            System.out.println("The ticket is free");
        }else if((Age > 2) && (Age <=12)){
            System.out.println("50% discount");
        }else if((Age > 12) && (Age <= 65)){
            System.out.println("full price ticket");
        }else if (Age > 65){
            System.out.println("80% discount");
        }
    }
}
