package timbuchalka.interfacesVsAbstractClasses.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone andrewsPhone; // Because it implements the interface, it allows andrewsPhone to be of type DeskPhone and MobilePhone
        andrewsPhone = new DeskPhone(1234567);
        andrewsPhone.powerOn();
        andrewsPhone.callPhone(1234567);
        andrewsPhone.answer();

        andrewsPhone = new MobilePhone(0742000111);
        andrewsPhone.powerOn();
        andrewsPhone.callPhone(0742000111);
        andrewsPhone.answer();
    }
}