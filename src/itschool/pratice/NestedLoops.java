package itschool.pratice;

public class NestedLoops {

    public static void main(String[] args) {
        int[][] complexArray = {{3, 1, 1}, {3, 4, 6}, {8, 5, 2}};
                  //           0          1          2
  //      for(int[] simpleArray : complexArray) {
   //         for(int index =0; index < simpleArray.length; index++) {
  //              System.out.print(simpleArray[index] + "\t");

                int searchValue = 4;
                int positionX = 0;
                int positionY = 0;
                for (int i = 0; i < complexArray.length; i++) {
                    for (int j = 0; j < complexArray[i].length; j++) {
                        if (complexArray[i][j] == searchValue) {
                            positionX = i;
                            positionY = j;
                            System.out.println(positionX + " " + positionY);


                        }
                    }
                }
            }
        }
  //  }
//}
