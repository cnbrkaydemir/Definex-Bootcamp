package com.cnbrkaydemir;

import com.cnbrkaydemir.model.House;
import com.cnbrkaydemir.model.HousingAgency;
import com.cnbrkaydemir.model.SummerHouse;
import com.cnbrkaydemir.model.Villa;
import com.cnbrkaydemir.service.impl.HousingServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HousingAgency housingAgency = new HousingAgency();

        housingAgency.setHouses(List.of(
                new House(3, 100, 3, 1),
                new House(2, 50, 1, 1),
                new House(5, 200, 4, 1)
        ));

       housingAgency.setVillas(List.of(
               new Villa(10, 300, 5, 3),
               new Villa(20, 400, 6, 4),
               new Villa(15, 400, 7, 5)
       ));

       housingAgency.setSummerHouses(List.of(
               new SummerHouse(10, 100, 3, 1),
               new SummerHouse(8, 120, 2, 1),
               new SummerHouse(20, 100, 4, 1)
       ));

        HousingServiceImpl housingService = new HousingServiceImpl();

        System.out.println("------------------Testing-----------------");
        System.out.printf("\nTotal Price of Houses : %.2f", housingService.calculateHousePrices(housingAgency));
        System.out.printf("\nTotal Price of Villas : %.2f", housingService.calculateVillaPrices(housingAgency));
        System.out.printf("\nTotal Price of Summer Houses : %.2f", housingService.calculateSummerHousePrices(housingAgency));
        System.out.printf("\nTotal Price of All Buildings : %.2f\n", housingService.calculateTotalPrices(housingAgency));
        System.out.printf("\nAverage Area of Houses in m^2: %.2f", housingService.calculateAverageHouseArea(housingAgency));
        System.out.printf("\nAverage Area of Villas in m^2 : %.2f", housingService.calculateAverageVillaArea(housingAgency));
        System.out.printf("\nAverage Area of Summer Houses in m^2 : %.2f", housingService.calculateAverageSummerHouseArea(housingAgency));
        System.out.printf("\nAverage Area of All Buildings : %.2f\n", housingService.calculateAverageArea(housingAgency));

        int numberOfRooms = 4;
        int numberOfSalons = 3;

        System.out.printf("\nFiltering houses with at least %d rooms and %d salons !!!\n", numberOfRooms, numberOfSalons);
        housingService.filterBuildings(housingAgency, numberOfRooms, numberOfSalons);

    }
}