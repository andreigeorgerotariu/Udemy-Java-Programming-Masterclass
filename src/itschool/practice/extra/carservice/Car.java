package itschool.practice.extra.carservice;

import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String licensePlate;
    private String serviceReason;
    private List<String> interventionList;
    private List<String> invoiceOperationList;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getServiceReason() {
        return serviceReason;
    }

    public void setServiceReason(String serviceReason) {
        this.serviceReason = serviceReason;
    }

    public List<String> getInterventionList() {
        return interventionList;
    }

    public void setInterventionList(List<String> interventionList) {
        this.interventionList = interventionList;
    }

    public List<String> getInvoiceOperationList() {
        return invoiceOperationList;
    }

    public void setInvoiceOperationList(List<String> invoiceOperationList) {
        this.invoiceOperationList = invoiceOperationList;
    }
}