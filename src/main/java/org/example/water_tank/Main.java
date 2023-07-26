package org.example.water_tank;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank(100,10,5);
        WaterTank waterTank2 = new WaterTank(70,25,15);



        System.out.println(waterTank1.getFillLevel());
        System.out.println(waterTank2.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        System.out.println("##################################");
        System.out.println("Poid total watertank 1 : "+waterTank1.totalWeight());
        System.out.println("Poid total watertank 2 : "+waterTank2.totalWeight());

        System.out.println("##################################");



        /*waterTank1.toFill(35);
        System.out.println(waterTank1.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        System.out.println("##################################");
        waterTank2.empty(20);
        System.out.println(waterTank2.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        System.out.println("##################################");

        System.out.println(WaterTank.totalCapacity);
        System.out.println(waterTank1.getFillLevel());
        System.out.println(waterTank2.getFillLevel());
        System.out.println("##################################");*/


        waterTank1.toFill(35);
        System.out.println(waterTank1.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        /*System.out.println("##################################");
        waterTank2.empty(10);
        System.out.println(waterTank2.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        System.out.println("##################################");


        System.out.println(waterTank1.getFillLevel());
        System.out.println(waterTank2.getFillLevel());
        System.out.println(WaterTank.totalCapacity);
        System.out.println("##################################");
        System.out.println("Poid total watertank 1 : "+waterTank1.totalWeight());
        System.out.println("Poid total watertank 2 : "+waterTank2.totalWeight());*/

    }
}
