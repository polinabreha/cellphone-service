package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String phoneModel, carrier, phoneNumber, owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.phoneModel = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone(int serialNumber, String phoneModel
            , String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber(){

        return serialNumber;
    }
    public String getPhoneModel(){

        return phoneModel;
    }
    public String getCarrier(){

        return carrier;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public String getOwner(){

        return owner;
    }

    public void setSerialNumber(int serialNumber){

        this.serialNumber = serialNumber;
    }
    public void setPhoneModel(String phoneModel){

        this.phoneModel = phoneModel;
    }
    public void setCarrier(String carrier){

        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner){

        this.owner = owner;
    }

    public void dial(String phoneNumber){
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }
    public void dial(CellPhone phoneNumber){
        System.out.println(owner + "'s phone is calling " + getPhoneNumber());
    }












}
