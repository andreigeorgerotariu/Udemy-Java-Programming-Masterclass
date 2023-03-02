package itschool.pratice.extra.petshopsimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Animal {
    String name;
    String type;
    double price;

    public Animal(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " (" + type + "): $" + price;
    }
}

class PetShopActions {
    List<Animal> animalsInStock;

    public PetShopActions() {
        animalsInStock = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalsInStock.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animalsInStock.remove(animal);
    }

    public List<Animal> getAnimals() {
        return animalsInStock;
    }

    public void printAnimals() {
        for (Animal animal : animalsInStock) {
            System.out.println(animal);
        }
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Animal animal : animalsInStock) {
            totalRevenue += animal.getPrice();
        }
        return totalRevenue;
    }
}

class PetShopRunner {
    public static void main(String[] args) {
        PetShopActions petShop = new PetShopActions();
        Scanner scanner = new Scanner(System.in);

        // Get the number of animals to add to the pet shop
        System.out.print("Enter the number of animals to add: ");
        int numAnimals = scanner.nextInt();

        // Add the animals to the pet shop
        for (int i = 0; i < numAnimals; i++) {
            System.out.println("Enter the details for animal #" + (i+1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Type: ");
            String type = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            Animal animal = new Animal(name, type, price);
            petShop.addAnimal(animal);
        }

        // Print the animals in stock and total revenue
        System.out.println("Animals in stock:");
        petShop.printAnimals();
        System.out.println("Total revenue: $" + petShop.calculateTotalRevenue());
    }
}
