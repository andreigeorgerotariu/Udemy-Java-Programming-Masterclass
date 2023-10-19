package extraPractice.itschool.practice.extra.carservice;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public boolean isBrandCarSupported(String carBrand) {
        switch (carBrand) {
            case "Vw":
                return true;
            case "Audi":
                return true;
            case "Opel":
                return true;
            default:
                return false;
        }
    }

    private void printInterventionList(List<String> interventionList) {
        for (String intervention : interventionList) {
            System.out.println(intervention);
        }
    }

    public List<String> getInvoiceList(List<String> interventionList) {
        List<String> invoiceOperationList = new ArrayList<>();
        Price price = new Price();
        price.setOilChange(34.54);
        price.setFilterChange(24.8);
        price.setDistributionChange(54.2);
        double totalAmount = 0;

        for (String intervention : interventionList) {
            if (intervention.equals("Oil change")) {
                totalAmount += price.getOilChange();
                invoiceOperationList.add("Oil change price: " + price.getOilChange());
            } else if (intervention.equals("Filter change")) {
                totalAmount += price.getFilterChange();
                invoiceOperationList.add("Filter change price: " + price.getFilterChange());
            } else if (intervention.equals("Distribution change")) {
                totalAmount += price.getDistributionChange();
                invoiceOperationList.add("Distribution change price: " + price.getDistributionChange());
            }
        }
        invoiceOperationList.add("Total: " + totalAmount);
        return invoiceOperationList;
    }

    public void printInvoiceList(List<String> invoiceList) {
        for (String invoice : invoiceList) {
            System.out.println(invoice);
        }
    }
}