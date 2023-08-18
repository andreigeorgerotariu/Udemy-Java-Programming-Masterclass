package timbuchalka.core;

public class CharAndBoolean {
    public static void main(String[] args) {

        char myChar = 'D'; // single quotes (')/ can store only 1 character
        char myUnicodeChar = '\u0044'; // unicode value for 'D' / unicode-table.com
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9'; // ??? Not working? Go to Settings -> Editor -> File Encodings -> ProjectToDO Encoding and set it to "UTF-8".
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverEighteen = true; // starts with "is" and a question
    }
}