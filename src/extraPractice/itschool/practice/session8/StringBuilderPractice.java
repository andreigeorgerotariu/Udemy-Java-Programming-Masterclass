package extraPractice.itschool.practice.session8;

public class StringBuilderPractice {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test");
        stringBuilder.append(" second part");
        stringBuilder.deleteCharAt(0);
//        System.out.println(stringBuilder);

        String country = "Romania";
        StringBuilder reverseSb = new StringBuilder();
        reverseSb.append(country);
        reverseSb.reverse();

        String stringName = "";
        StringBuilder sbName = new StringBuilder();
        for (int index = 0; index < 5; index++) {
            stringName += "a";
            sbName.append("a");
        }
        System.out.println(stringName);
        System.out.println(sbName);
    }
}