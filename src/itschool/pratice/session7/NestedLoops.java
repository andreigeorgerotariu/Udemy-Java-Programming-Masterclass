package itschool.pratice.session7;

public class NestedLoops {

    public static void main(String[] args) {
        //                    simpleArray
        int[][] complexArray = {{3, 2, 1}, {3, 4, 6}, {8, 5, 2}};
        //                          0           1          2

        FIRST_LOOP: for (int[] simpleArray : complexArray) {
           SECOND_LOOP: for (int index = 0; index < simpleArray.length; index++) {
//                System.out.println(index);
                System.out.print(simpleArray[index] + "\t");
                if(index > 1){
                    //code goes here
                    break;
                }
            }
        }
    }
}