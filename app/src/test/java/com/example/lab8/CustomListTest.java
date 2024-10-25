package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private static CustomList list;

    @BeforeAll
    public static void setUp() {
        list = new CustomList(null, new ArrayList<>()); // You can pass null for context
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount(); // Initial size
        list.addCity(new City("Edmonton", "AB")); // Add a city
        assertEquals(listSize + 1, list.getCount()); // Check if size increased by 1
    }
}
