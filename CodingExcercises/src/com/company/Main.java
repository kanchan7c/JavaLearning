package com.company;

public class Main {

    public static void main(String[] args) {
	long value = toMilesPerHour(10.5);
	printConversion(value);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round( kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0){
                System.out.println("Invalid Value");
            } else {
                System.out.println( kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour)+ " mi/h");
            }
    }
}
