package Assignment.fizzBuzz;

/**
 * Created by 44020369 on 10/18/2017.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz obfizz = new FizzBuzz();
    }

    void fizzBuzz(){
        for (int i=1; i<=100 ; i++) {

            if (i%3==0){
                if(i%5==0){
                  System.out.println("FizzBuzz" + "\t***Number is multiple of 3 and 5 both. No is : " + i );
                }
                else{
                    System.out.println("Fizz"  + "\t***Number is multiple of 3 . No is : " + i );
                }
            }
            else if (i%5==0){
                System.out.println("Buzz"+ "\t***Number is multiple of 5 . No is : " + i);
            }
            else {
                System.out.println(i  + "\t***Number is neither multiple of 5 or 3 . No is : " + i);
            }

        }
    }
}