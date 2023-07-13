package itschool.practice.extra.carservice;

import java.util.ArrayList;
import java.util.List;

public class ServiceApplication {

    public static void main(String[] args) {
        List<String> mariaCarInterventionList = new ArrayList<>();
        mariaCarInterventionList.add("Oil change");
        mariaCarInterventionList.add("Distribution change");

        Car mariaCar = new Car();
        mariaCar.setBrand("Vw");
        mariaCar.setModel("Polo");
        mariaCar.setServiceReason("Oil change");
        mariaCar.setLicensePlate("BT 35 MAR");
        mariaCar.setInterventionList(mariaCarInterventionList);

        User mariaUserService = new User();
        mariaUserService.setFirstName("Maria");
        mariaUserService.setLastName("Popescu");
        mariaUserService.setEmail("maria@gmail.com");
        mariaUserService.setPhone("04538453");
        mariaUserService.setCar(mariaCar);

        CarService carServiceForMaria = new CarService();
        System.out.println("Is Maria's car supported: " + carServiceForMaria.isBrandCarSupported(mariaCar.getBrand()));
        carServiceForMaria.printInvoiceList(carServiceForMaria.getInvoiceList(mariaCarInterventionList));
    }
}