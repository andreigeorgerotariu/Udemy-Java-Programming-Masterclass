package timbuchalka.core;

public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        // "=" is an assignment operator
        System.out.println("1+2= " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3-1 = 2
        System.out.println("3-1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2*10= 20
        System.out.println("2*10= " + result);

        result = result / 5; // 20/5= 4
        System.out.println("20/5= " + result);

        result = result % 3; // MODULUS OPERATOR - reminder of (4 % 3) = 1
        System.out.println("4 modulus 3 = " + result);

        // result = result + 1;
        result++; //1+1=2
        System.out.println("++ operator = " + result);

        result--; // 2-1=1
        System.out.println("-- operator = " + result);

        // result = result + 2;
        result += 2; // 1+2 = 3
        System.out.println("+= operator 2 = " + result);

        //result = result *10;
        result *= 10; // 3*10 =30
        System.out.println("*= operator 10 = " + result);

        //result = result / 3;
        result /=3; // 30/3 =10
        System.out.println("/= operator 3 = " + result);

        //result = result -2
        result -=2; // 10-2=8
        System.out.println("-= operator 2 = " + result);

        int topScore = 80;
        if (topScore != 100) {   // "!=" Not equal operator
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) { //&& two ampersands put together is a logical AND operator that represents "AND" operation
            System.out.println("Greater than second top score and less than 100");
        }   // Both left and right operand conditions have to be true for the statement on line 52 to be executed.

         if ((topScore > 90) || (secondTopScore <= 90)) { // "||" OR operator represented by two pipe characters.
             System.out.println("Either or both of the conditions are true");
         }

         int newValue = 50;
         if(newValue == 50) { // there is a difference between the Assignment ("=") and the Equals to ("==") operators
             System.out.println("This is an error/ this is true");
         }

         boolean isCar = false;
         if (isCar = true) { // isCar variable is a boolean that is being assigned (by the assign operator "=") the value true
             System.out.println("This is not supposed to happen");
         }
         if (isCar) {  // Alternative way of writing is it true boolean expression
             System.out.println("This is not supposed to happen case 2");
         }
         if(!isCar) {   // Alternative way of writing is it false boolean expression
             System.out.println("This is not supposed to happen case 3");

  //       isCar = true;
  //       boolean wasCar = isCar ? false : true;
  //       if (wasCar) {
             System.out.println("WasCar is true");
       //  }
         }
    }
}