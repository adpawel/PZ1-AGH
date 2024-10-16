package org.example.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.MyMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

public class MyMapTest {

    private MyMap<String, Integer> map;

    @BeforeEach
    public void setUp() {
        map = new MyMap<>();
    }

    @Test
    public void testPutAndGet() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        assertEquals(25, map.get("Jan"));
        assertEquals(30, map.get("Anna"));
    }

    @Test
    public void testPutUpdatesValue() {
        map.put("Jan", 25);
        map.put("Jan", 35);  // Nadpisujemy wartość
        assertEquals(35, map.get("Jan"));  // Sprawdzamy, czy wartość została zaktualizowana
    }

    @Test
    public void testRemove() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        assertEquals(25, map.remove("Jan"));  // Usuwamy Jana
        assertNull(map.get("Jan"));  // Sprawdzamy, czy klucz został usunięty
        assertEquals(1, map.size());  // Rozmiar powinien być 1
    }

    @Test
    public void testSize() {
        assertEquals(0, map.size());  // Na początku mapa powinna być pusta
        map.put("Jan", 25);
        assertEquals(1, map.size());  // Po dodaniu 1 elementu rozmiar to 1
        map.put("Anna", 30);
        assertEquals(2, map.size());  // Po dodaniu 2 elementu rozmiar to 2
    }

    @Test
    public void testIsEmpty() {
        assertTrue(map.isEmpty());  // Na początku mapa powinna być pusta
        map.put("Jan", 25);
        assertFalse(map.isEmpty());  // Po dodaniu elementu mapa nie powinna być pusta
    }

    @Test
    public void testClear() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        map.clear();  // Czyścimy mapę
        assertEquals(0, map.size());  // Rozmiar powinien być 0
        assertTrue(map.isEmpty());  // Mapa powinna być pusta
        assertNull(map.get("Jan"));  // Nie powinna mieć elementów
    }

    @Test
    public void testContainsKey() {
        map.put("Jan", 25);
        assertTrue(map.containsKey("Jan"));  // Mapa powinna zawierać klucz "Jan"
        assertFalse(map.containsKey("Anna"));  // Mapa nie powinna zawierać klucza "Anna"
    }

    @Test
    public void testContainsValue() {
        map.put("Jan", 25);
        assertTrue(map.containsValue(25));  // Mapa powinna zawierać wartość 25
        assertFalse(map.containsValue(30));  // Mapa nie powinna zawierać wartości 30
    }

    @Test
    public void testKeys() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        LinkedList<String> keys = map.keys();
        assertTrue(keys.contains("Jan"));  // Klucz "Jan" powinien być obecny
        assertTrue(keys.contains("Anna"));  // Klucz "Anna" powinien być obecny
    }

    @Test
    public void testValues() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        Collection<Integer> values = map.values();
        assertTrue(values.contains(25));  // Wartość 25 powinna być obecna
        assertTrue(values.contains(30));  // Wartość 30 powinna być obecna
    }

    @Test
    public void testEquals() {
        MyMap<String, Integer> anotherMap = new MyMap<>();
        map.put("Jan", 25);
        anotherMap.put("Jan", 25);
        assertTrue(map.equals(anotherMap));  // Mapy powinny być równe

        anotherMap.put("Anna", 30);
        assertFalse(map.equals(anotherMap));  // Teraz mapy nie są równe
    }

    @Test
    public void testKeySet() {
        map.put("Jan", 25);
        map.put("Anna", 30);
        Set<String> keySet = map.keySet();
        assertTrue(keySet.contains("Jan"));  // Klucz "Jan" powinien być obecny
        assertTrue(keySet.contains("Anna"));  // Klucz "Anna" powinien być obecny
    }

    @Test
    public void testPutAll() {
        MyMap<String, Integer> anotherMap = new MyMap<>();
        anotherMap.put("Jan", 25);
        anotherMap.put("Anna", 30);

        map.putAll(anotherMap);
        assertEquals(2, map.size());  // Po dodaniu mapy, rozmiar mapy powinien być 2
        assertEquals(25, map.get("Jan"));
        assertEquals(30, map.get("Anna"));
    }
}


