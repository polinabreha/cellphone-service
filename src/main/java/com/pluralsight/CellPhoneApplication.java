package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        CellPhone phone = new CellPhone();
        CellPhone phone2 = new CellPhone(
                9999999,
                "IPhone 15",
                "Verizon",
                "888-555-4545",
                "Mike");

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String phoneModel = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setPhoneModel(phoneModel);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);


        System.out.println("------Phone Information------");
        display(phone);
        System.out.println("------Second Phone Information------");
        display(phone2);
        phone.dial(phone2);
        phone2.dial(phone);

    }
    public static void display(CellPhone phone) {
        System.out.println("1. The serial number is: " + phone.getSerialNumber());
        System.out.println("2. The model of the phone is: " + phone.getPhoneModel());
        System.out.println("3. The carrier of the phone is: " + phone.getCarrier());
        System.out.println("4. The phone number is: " + phone.getPhoneNumber());
        System.out.println("5. The owner is: " + phone.getOwner());
    }


}
