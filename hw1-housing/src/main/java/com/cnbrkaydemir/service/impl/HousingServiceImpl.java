//Implementation of Housing Service

package com.cnbrkaydemir.service.impl;

import com.cnbrkaydemir.model.Building;
import com.cnbrkaydemir.model.HousingAgency;
import com.cnbrkaydemir.service.HousingService;

import java.util.List;

public class HousingServiceImpl implements HousingService {

    @Override
    public double calculateBuildingPrice(List<? extends Building> buildings) {
        double totalPrice = 0;

        for (Building building : buildings) {
            totalPrice += building.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double calculateHousePrices(HousingAgency housingAgency) {
        return calculateBuildingPrice(housingAgency.getHouses());
    }

    @Override
    public double calculateVillaPrices(HousingAgency housingAgency) {
        return calculateBuildingPrice(housingAgency.getVillas());
    }

    @Override
    public double calculateSummerHousePrices(HousingAgency housingAgency) {
        return calculateBuildingPrice(housingAgency.getSummerHouses());
    }

    @Override
    public double calculateTotalPrices(HousingAgency housingAgency) {
        return calculateHousePrices(housingAgency) +
                calculateVillaPrices(housingAgency) +
                calculateSummerHousePrices(housingAgency);
    }

    @Override
    public double calculateBuildingArea(List<? extends Building> buildings) {
        double totalArea = 0;

        for (Building building : buildings) {
            totalArea += building.getArea();
        }
        return totalArea;
    }

    @Override
    public double calculateHouseAreas(HousingAgency housingAgency) {
        return calculateBuildingArea(housingAgency.getHouses());
    }

    @Override
    public double calculateVillaAreas(HousingAgency housingAgency) {
        return calculateBuildingArea(housingAgency.getVillas());
    }

    @Override
    public double calculateSummerHouseAreas(HousingAgency housingAgency) {
        return calculateBuildingArea(housingAgency.getSummerHouses());
    }

    @Override
    public double calculateCumulativeArea(HousingAgency housingAgency) {
        return calculateHouseAreas(housingAgency) + calculateVillaAreas(housingAgency)
                + calculateSummerHouseAreas(housingAgency);
    }

    @Override
    public double calculateAverageHouseArea(HousingAgency housingAgency) {
        return calculateHouseAreas(housingAgency) /housingAgency.getHouses().size();
    }

    @Override
    public double calculateAverageVillaArea(HousingAgency housingAgency) {
        return calculateVillaAreas(housingAgency) /housingAgency.getVillas().size();
    }

    @Override
    public double calculateAverageSummerHouseArea(HousingAgency housingAgency) {
        return calculateSummerHouseAreas(housingAgency) /housingAgency.getSummerHouses().size();
    }

    @Override
    public double calculateAverageArea(HousingAgency housingAgency) {
        return calculateCumulativeArea(housingAgency)
                / (housingAgency.getHouses().size()
                + housingAgency.getVillas().size()
                + housingAgency.getSummerHouses().size());
    }

    @Override
    public void filterBuildings(HousingAgency housingAgency, int numberOfRooms, int numberOfSalons) {
        filterSingleBuildingType(housingAgency.getHouses(), numberOfRooms, numberOfSalons); // Filter Houses

        filterSingleBuildingType(housingAgency.getVillas(), numberOfRooms, numberOfSalons); // Filter Villas

        filterSingleBuildingType(housingAgency.getSummerHouses(), numberOfRooms, numberOfSalons); // Filter SH.
    }

    @Override
    public void filterSingleBuildingType(List<? extends Building> buildings, int numberOfRooms, int numberOfSalons) {
        buildings
            .stream()
            .filter(building -> building.getNumberOfRooms() >= numberOfRooms
                    && building.getNumberOfSalons() >= numberOfSalons)
                .forEach(System.out::println);

    }
}
