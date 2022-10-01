public class digitsumchallange {

    public static int digitsum(int number){
        int sum =0;

        if (number >= 10){
            while (number >=0){
                sum=number%10;
                number=number/10;
            }
            return sum;
        }
        return -1;
    }
}
