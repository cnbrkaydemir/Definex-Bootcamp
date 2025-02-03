// The class that stores lists of houses, villas and summer houses.

package com.cnbrkaydemir.model;

import java.util.ArrayList;
import java.util.List;

public class HousingAgency {

    private List<House> houses;

    private List<Villa> villas;

    private List<SummerHouse> summerHouses;

    public HousingAgency() {
        this.houses = new ArrayList<>();
        this.villas = new ArrayList<>();
        this.summerHouses = new ArrayList<>();
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public void setVillas(List<Villa> villas) {
        this.villas = villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public void setSummerHouses(List<SummerHouse> summerHouses) {
        this.summerHouses = summerHouses;
    }
}
