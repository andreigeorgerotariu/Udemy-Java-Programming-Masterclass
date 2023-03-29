package morePractice.mar22;

//Write a function that removes the spaces from the string, then return the resultant string.
//
//        Examples:
//
//        Input -> Output
//        "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
//        "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
//        "8aaaaa dddd r     " -> "8aaaaaddddr"


import java.util.ArrayList;
import java.util.List;

public class RemoveStringSpaces {
    public static void main(String[] args) {

        String input = "8 j 8   mBliB8g  imjB8B8  jl  B";

        transformInput(input);

        List<String> stringList = new ArrayList<>();
        stringList.add("8 j 8   mBliB8g  imjB8B8  jl  B");
        stringList.add("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd");
        stringList.add("8aaaaa dddd r     ");
        transformInput(stringList);
    }

    public static void transformInput(String input) {
        String modifiedInput = input.replaceAll(" ", "");
        System.out.println(modifiedInput);
    }

    public static void transformInput(List<String> stringList) {
        for (String input : stringList) {
            transformInput(input);
        }
    }
}
