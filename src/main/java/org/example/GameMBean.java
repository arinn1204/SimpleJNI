package org.example;

import java.util.List;

public interface GameMBean {

    String getStringAttribute();

    void setStringAttribute(String attribute);

    String getString(String name);

    void putString(String name, String value);

    Double getDouble(String name);

    void putDouble(String name, Double value);

    Long getLong(String name);

    void putLong(String name, Long value);

    Integer getInteger(String name);

    void putInteger(String name, Integer value);

    Boolean getBoolean(String name);

    void putBoolean(String name, Boolean value);

    Float getFloat(String name);

    void putFloat(String name, Float value);

    List<Object> getList(String name);

    void putList(String name, List<Object> value);
}
