public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
      
       /* First approach - while 
        int sum = 0;
        int lastDigit = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum = sum + lastDigit;
                }
                number = number / 10;
            }

            return sum;
        } */

        /**
         * Second approach
         */

         if(number < 0 ){
            return -1;
         }

         int sum = 0;
         for(int i=number; i>0; i /= 10){
            int lastDigit = i%10;
            if(lastDigit %2 == 0) {
                sum += lastDigit;
            }
         }

         return sum;
        
    }
}
