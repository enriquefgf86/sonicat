package com.example.test.entities;

public class GenericAttributes {
    private String name;
    private String type;
    private String identifier;

    public GenericAttributes() {};

    public GenericAttributes(String name, String type, String identifier) {
        this.name = name;
        this.type = type;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "GenericAttributes{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
