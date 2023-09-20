package timbuchalka.interfacesVsAbstractClasses.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone andrewsPhone;
        andrewsPhone = new DeskPhone(1234567);
        andrewsPhone.powerOn();
        andrewsPhone.callPhone(1234567);
        andrewsPhone.answer();
    }
}