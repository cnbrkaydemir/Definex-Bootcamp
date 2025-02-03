package com.cnbrkaydemir.service;

import com.cnbrkaydemir.model.Building;
import com.cnbrkaydemir.model.HousingAgency;

import java.util.List;

public interface HousingService {

    double calculateBuildingPrice(List<? extends Building> buildings);

    double calculateHousePrices(HousingAgency housingAgency);

    double calculateVillaPrices(HousingAgency housingAgency);

    double calculateSummerHousePrices(HousingAgency housingAgency);

    double calculateTotalPrices(HousingAgency housingAgency);

    double calculateBuildingArea(List<? extends Building> buildings);

    double calculateHouseAreas(HousingAgency housingAgency);

    double calculateVillaAreas(HousingAgency housingAgency);

    double calculateSummerHouseAreas(HousingAgency housingAgency);

    double calculateAverageHouseArea(HousingAgency housingAgency);

    double calculateAverageVillaArea(HousingAgency housingAgency);

    double calculateAverageSummerHouseArea(HousingAgency housingAgency);

    double calculateAverageTotalPrice(HousingAgency housingAgency);

    void filterBuildings(HousingAgency housingAgency, int numberOfRooms, int numberOfSalons);

    void filterSingleBuildingType(List<? extends Building> buildings, HousingAgency housingAgency);


}
