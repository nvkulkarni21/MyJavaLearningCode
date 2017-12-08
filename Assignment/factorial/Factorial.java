package Assignment.factorial;



public class Factorial {

    public int fact(int num){

        if (num == 0 ){
            return 1;
        }
        num = num * fact(num-1);
        return num;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial value is : " + fact.fact(5));
    }
}
