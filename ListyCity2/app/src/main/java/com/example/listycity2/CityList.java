package com.example.listycity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**  * This is a class that keeps a list of city objects */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a City type object to the cities list
     * @param c: the object to add
     * @throws : IllegalArgumentException if c already exists in the list or not.
     * */
    public void add(City c) {
        if (cities.contains(c)) {
            throw new IllegalArgumentException();
        }
        cities.add(c);
    }

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the list already contains the specified city.
     * @param city :  the city to check
     * @return true if the city exists in the list; false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Removes a city from the list.
     * @param city : the city to remove
     * @throws IllegalArgumentException if the city does not exist
     */
    public void delete(City city){
        if(cities.contains(city)){
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException("City not found in the list");
        }
    }

    /**
     * Returns the number of cities currently in the list.
     * @return the number of cities
     */
    public int countCities(){
        return cities.size();
    }
}
