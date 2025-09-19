public class EvenOdd {
    public static void main(String [] args){
        int number = 10;
        boolean isEven = number % 2==0;
        //number%2==0 will be true
        boolean isOdd = number % 2!=0;
        System.out.println("the nunnmber " + number + " is even: " + isEven);
        System.out.println("the number " + number + " is odd: " + isOdd);

    }
}
