package com.example.lab8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    public CustomList MockCityList() {
        return new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City city = new City("Toronto", "ON");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Vancouver", "BC")));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Calgary", "AB");
        list.addCity(city);
        assertTrue(list.deleteCity(city));
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        assertEquals(0, list.countCities());
        list.addCity(new City("Halifax", "NS"));
        assertEquals(1, list.countCities());
        list.addCity(new City("Montreal", "QC"));
        assertEquals(2, list.countCities());
    }
}
