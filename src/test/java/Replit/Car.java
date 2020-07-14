package Replit;


public class Car {
    String make="unknown";
    String model="unknown";
    int numberOfDoors=4;
    int topSpeed=9;
    double price=0;

    Car(){

    }Car(String make, String model,int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.price=price;
        this.topSpeed=topSpeed;
        numberOfDoors=4;
    }
    Car(int topSpeed, double price, int numberOfDoors) {
        this.topSpeed= topSpeed;
        this.numberOfDoors= numberOfDoors;
        this.price= price;
        make="unknown";
        model="unknown";
    }
    Car(  String make, String model, int numberOfDoors ) {

        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        price=0;
    }
}
