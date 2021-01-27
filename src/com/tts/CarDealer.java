package com.tts;
import java.util.Scanner;
import java.util.HashMap;

public class CarDealer {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What car model are you looking for? ");
        String carModel = userInput.nextLine();

        HashMap<String, String> carInventory = new HashMap<>();

        carInventory.put("Camry", "Toyota");
        carInventory.put("Highlander", "Toyota");
        carInventory.put("Corolla", "Toyota");
        carInventory.put("Civic", "Honda");
        carInventory.put("Accord", "Honda");
        carInventory.put("ES", "Lexus");
        carInventory.put("LS", "Lexus");
        carInventory.put("Suburban", "Chevrolet");
        carInventory.put("Malibu", "Chevrolet");
        carInventory.put("Tahoe", "Chevrolet");


        if (carInventory.containsKey(carModel)){
            System.out.println("Oh, you're looking for a " + carModel + "? " + "Our selection is right over here. Follow me my pretty...");
        } else {
            System.out.println("Sorry we don't have that car available, try Sears.");
        }
    }
}
