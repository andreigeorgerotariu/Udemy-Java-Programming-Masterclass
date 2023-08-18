package timbuchalka.OOP.classes;

public class Car {

    private int doors;
    private int wheels;
    private String model; // String is a class
    private String engine;
    private String colour;


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("logan")){
            this.model = model; // 'this' keyword - updates this model with the contents of the parameter model
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

}