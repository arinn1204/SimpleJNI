package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GameMBean {

    String getStringAttribute();
    Integer getIntegerAttribute();
    Long getLongAttribute();
    Float getFloatAttribute();
    Double getDoubleAttribute();
    Boolean getBooleanAttribute();
    List<String> getListAttribute();
    void setListAttribute(List<String> a);

    Set<Float> getSetAttribute();
    void setSetAttribute(Set<Float> s);

    void setIntegerAttribute(Integer attribute);
    void setLongAttribute(Long attribute);
    void setFloatAttribute(Float attribute);
    void setDoubleAttribute(Double attribute);
    void setBooleanAttribute(Boolean attribute);
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

    Set<Object> getSet(String name);

    void putSet(String name, Set<Object> value);

    Map<Object, Object> getMap(String name);
}
