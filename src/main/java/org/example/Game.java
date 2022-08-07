package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game implements GameMBean {

    private String stringAttribute;

    private final Map<String, String> stringMap = Map.of("messi", "fast");
    private final Map<String, Double> doubleMap = new HashMap<>();
    private final Map<String, Long> longMap = new HashMap<>();
    private final Map<String, Integer> intMap = new HashMap<>();
    private final Map<String, Boolean> booleanMap = new HashMap<>();
    private final Map<String, List<Object>> listMap = new HashMap<>();

    @Override
    public String getStringAttribute() {
        return stringAttribute;
    }

    @Override
    public void setStringAttribute(String attribute) {
        this.stringAttribute = attribute;
    }

    @Override
    public String getString(String name) {
        System.out.println("executing getValue for " + name);
        return stringMap.get(name);
    }

    @Override
    public void putString(String name, String value) {
        System.out.println("executing putValue for " + name + " with a value of " + value);
        stringMap.put(name, value);
    }

    @Override
    public Double getDouble(String name) {
        return doubleMap.computeIfAbsent(name, ignored -> 0.0);
    }

    @Override
    public void putDouble(String name, Double value) {
        doubleMap.put(name, value);
    }

    @Override
    public Long getLong(String name) {
        return longMap.get(name);
    }

    @Override
    public void putLong(String name, Long value) {
        longMap.put(name, value);
    }

    @Override
    public Integer getInteger(String name) {
        return intMap.get(name);
    }

    @Override
    public void putInteger(String name, Integer value) {
        intMap.put(name, value);
    }

    @Override
    public Boolean getBoolean(String name) {
        return booleanMap.get(name);
    }

    @Override
    public void putBoolean(String name, Boolean value) {
        booleanMap.put(name, value);
    }

    @Override
    public List<Object> getList(String name) {
        return listMap.get(name);
    }

    @Override
    public void putList(String name, List<Object> value) {
        listMap.put(name, value);
    }
}