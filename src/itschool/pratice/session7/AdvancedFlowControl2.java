package itschool.pratice.session7;

public class AdvancedFlowControl2 {

    public static void main(String[] args) {
        String [] cars = {"Logan", "Bwm", "Mercedes"};
        //                   0       1        2
        System.out.println(cars[0]); //Logan
        //index control
        for(int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }

        //no index
        for(String car : cars) {
            System.out.println(car);
        }
    }
}