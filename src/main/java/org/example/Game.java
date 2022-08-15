package org.example;

import java.util.*;

public class Game implements GameMBean {
    private String stringAttribute;
    private Long longAttribute;
    private Double doubleAttribute;
    private Float floatAttribute;
    private Boolean boolAttribute;
    private Integer intAttribute;

    private final Map<String, String> stringMap = new HashMap<>();
    private final Map<String, Double> doubleMap = new HashMap<>();
    private final Map<String, Long> longMap = new HashMap<>();
    private final Map<String, Integer> intMap = new HashMap<>();
    private final Map<String, Boolean> booleanMap = new HashMap<>();
    private final Map<String, Float> floatMap = new HashMap<>();
    private final Map<String, List<Object>> listMap = new HashMap<>();
    private final Map<String, Set<Object>> setMap = new HashMap<>();
    private final Map<String, Map<Object, Object>> mapMap = new HashMap<>();

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
        Double aDouble = doubleMap.computeIfAbsent(name, ignored -> 0.0);
        System.out.println("executing getValue for " + name + " and was " + aDouble);
        return aDouble;
    }

    @Override
    public void putDouble(String name, Double value) {
        System.out.println("executing putValue for " + name + " with a value of " + value);
        doubleMap.put(name, value);
    }

    @Override
    public Long getLong(String name) {
        System.out.println("executing getValue for " + name);
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
    public Float getFloat(String name) {
        Float aFloat = floatMap.get(name);
        System.out.println("executing getValue for " + name + " and was " + aFloat);
        return aFloat;
    }

    @Override
    public void putFloat(String name, Float value) {
        System.out.println("executing putValue for " + name + " with a value of " + value);
        floatMap.put(name, value);
    }

    @Override
    public List<Object> getList(String name) {
        return listMap.get(name);
    }

    @Override
    public void putList(String name, List<Object> value) {
        listMap.put(name, value);
    }

    @Override
    public Set<Object> getSet(String name) {
        return setMap.get(name);
    }

    @Override
    public void putSet(String name, Set<Object> value) {
        setMap.put(name, value);
    }

    @Override
    public Map<Object, Object> getMap(String name) {
        return mapMap.get(name);
    }

    @Override
    public Double getDoubleAttribute() {
        return doubleAttribute;
    }

    public void setDoubleAttribute(Double doubleAttribute) {
        this.doubleAttribute = doubleAttribute;
    }

    @Override
    public Float getFloatAttribute() {
        return floatAttribute;
    }

    public void setFloatAttribute(Float floatAttribute) {
        this.floatAttribute = floatAttribute;
    }

    @Override
    public Long getLongAttribute() {
        return longAttribute;
    }

    public Boolean getBoolAttribute() {
        return boolAttribute;
    }

    public void setLongAttribute(Long longAttribute) {
        this.longAttribute = longAttribute;
    }

    public void setBoolAttribute(Boolean boolAttribute) {
        this.boolAttribute = boolAttribute;
    }

    @Override
    public Integer getIntAttribute() {
        return intAttribute;
    }

    public void setIntAttribute(Integer intAttribute) {
        this.intAttribute = intAttribute;
    }
}