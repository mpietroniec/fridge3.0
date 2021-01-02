package com.project.fridge30.models;

public class Property {
    private int propertyImage;
    private String propertyName;

    public Property(int propertyImage, String propertyName) {
        this.propertyImage = propertyImage;
        this.propertyName = propertyName;
    }

    public Property() {
    }

    public int getPropertyImage() {
        return propertyImage;
    }

    public void setPropertyImage(int propertyImage) {
        this.propertyImage = propertyImage;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyImage=" + propertyImage +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }
}
