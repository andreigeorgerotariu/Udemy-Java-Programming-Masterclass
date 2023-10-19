package extraPractice.itschool.practice.extra.feb05;

public class ManagementService {

    //Place breakpoints by clicking near the line number from the left (you should see a red dot - that's the breakpoint)
    //Run this method in Debug mode
    //Each breakpoint will stop the execution of the program and can be evaluated
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();

        livingRoom.setColour("green");
        livingRoom.setLengthRoom(12.5);
        livingRoom.setWidthRoom(15.1);
        livingRoom.setWindows(true);
        livingRoom.setWindowsHeight(1.5);
        livingRoom.setWindowsWidth(3.5);
        //ctrl+p - shows parameter type, and number of parameters
        livingRoom.setWindowsPosition("On the west side of the building");

        livingRoom.setAc(true);
        livingRoom.setTv(true);
        livingRoom.setCouch(true);
        livingRoom.setWifi(false);

        boolean isAcRoom = livingRoom.isAc();
        boolean isTvRoom = livingRoom.isTv();
        boolean isCouchRoom = livingRoom.isCouch();
        boolean isWifiRoom = livingRoom.isWifi();

        double feeForRoomSize = getFeeForRoomSize(livingRoom.getLengthRoom(), livingRoom.getWidthRoom());
        double feeForUtilities = getFeeForUtilities(isAcRoom, isTvRoom, isCouchRoom, isWifiRoom);
        double totalLivingRoomFee = feeForRoomSize + feeForUtilities;
        System.out.println("Total fee for living room: " + totalLivingRoomFee);
    }

    public static double getFeeForRoomSize(double length, double width) {
        double priceForSquareMeter = 10;
        double roomSize = length * width;

        return roomSize * priceForSquareMeter;
    }

    public static double getFeeForUtilities(boolean ac, boolean tv, boolean couch, boolean wifi) {
        double fee = 0;
        double feePerUnit = 5;
        if (ac) {
            fee += feePerUnit;
        }
        if (tv) {
            fee += feePerUnit;
        }
        if (couch) {
            fee += feePerUnit;
        }
        if (wifi) {
            fee += feePerUnit;
        }
        return fee;
    }
}