package timbuchalka;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

//        for(count = 1; count !=5; count++){
//            System.out.println("For count value is: " + count);
//        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Second count value is: " + count);
            count++; // Without this it would print "Updated count value is: 1" to infinity
        }

        count = 1; // in this case, if we set the count to 5, will execute at least once, and because of that it will skip 5 and execute an infinite loop
        do {
            System.out.println("Third count value is: " + count);
            count++;
        } while (count != 5);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // use "continue" to bypass the print statement and go back to the start of the loop
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;

            if (evenNumbersFound == 5) {
                System.out.println("The total even numbers found is: " + evenNumbersFound);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
