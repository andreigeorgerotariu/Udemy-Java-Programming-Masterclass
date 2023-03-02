package itschool.pratice.extra.feb05;

public class LivingRoom {

    private String colour;
    private double widthRoom;
    private double lengthRoom;
    private boolean tv;
    private boolean couch;
    private boolean ac;
    private boolean wifi;
    private boolean windows;
    private String windowsPosition;
    private double windowsWidth;
    private double windowsHeight;

    public String getColour() {
        return colour;
    }

    //public - access modifier
    //void - return type, doesn't return anything
    //setColour - method name
    //(String colour) - method parameter of type String, and name colour
    //this.colour - colour variable declared above, at line 5
    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWidthRoom() {
        return widthRoom;
    }

    public void setWidthRoom(double widthRoom) {
        this.widthRoom = widthRoom;
    }

    public double getLengthRoom() {
        return lengthRoom;
    }

    public void setLengthRoom(double lengthRoom) {
        this.lengthRoom = lengthRoom;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isCouch() {
        return couch;
    }

    public void setCouch(boolean couch) {
        this.couch = couch;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public String getWindowsPosition() {
        return windowsPosition;
    }

    public void setWindowsPosition(String windowsPosition) {
        this.windowsPosition = windowsPosition;
    }

    public double getWindowsWidth() {
        return windowsWidth;
    }

    public void setWindowsWidth(double windowsWidth) {
        this.windowsWidth = windowsWidth;
    }

    public double getWindowsHeight() {
        return windowsHeight;
    }

    public void setWindowsHeight(double windowsHeight) {
        this.windowsHeight = windowsHeight;
    }
}