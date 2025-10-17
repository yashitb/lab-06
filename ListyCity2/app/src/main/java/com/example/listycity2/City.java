package com.example.listycity2;

import java.util.Objects;

/**  * This is a class that defines a City. */
public class City implements Comparable{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    String getProvince(){
        return this.province;
    }

    public void setProvince(String province){
        this.province = province;
    }

    /** This method compares cities based on the city name field
     * @return -1 if the caller is greater than the city name field
     */

    @Override
    public int compareTo(Object o) {
        City city = (City) o; //Typecasting
        return this.city.compareTo(city.getCity());
    }

    /**
     * Compares this {@code City} object to another object for equality.
     * <p>
     * Two {@code City} objects are considered equal if they have the same
     * city name and province name.
     * </p>
     *
     * @param obj the object to compare with this {@code City}
     * @return {@code true} if the specified object is equal to this {@code City};
     *         {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City city = (City) obj;
        return this.city.equals(city.city) && this.province.equals(city.province);
    }

    /**
     * Returns a hash code value for this {@code City}.
     * <p>
     * This implementation ensures that equal {@code City} objects have
     * the same hash code, based on their city and province names.
     * </p>
     *
     * @return a hash code value for this {@code City} object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
