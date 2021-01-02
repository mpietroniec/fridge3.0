package com.project.fridge30.models;

import android.os.Parcel;
import android.os.Parcelable;

public class FridgeProduct implements Parcelable {
    private long fridgeProductID;
    private String fridgeProductName;
    private int fridgeProductAmount;

    public FridgeProduct(String fridgeProductName, int fridgeProductAmount, long fridgeProductID) {
        this.fridgeProductID = fridgeProductID;
        this.fridgeProductName = fridgeProductName;
        this.fridgeProductAmount = fridgeProductAmount;
    }

    public FridgeProduct() {
    }

    protected FridgeProduct(Parcel in) {
        fridgeProductID = in.readLong();
        fridgeProductName = in.readString();
        fridgeProductAmount = in.readInt();
    }

    public static final Creator<FridgeProduct> CREATOR = new Creator<FridgeProduct>() {
        @Override
        public FridgeProduct createFromParcel(Parcel in) {
            return new FridgeProduct(in);
        }

        @Override
        public FridgeProduct[] newArray(int size) {
            return new FridgeProduct[size];
        }
    };

    public long getFridgeProductID() {
        return fridgeProductID;
    }

    public void setFridgeProductID(long fridgeProductID) {
        this.fridgeProductID = fridgeProductID;
    }

    public String getFridgeProductName() {
        return fridgeProductName;
    }

    public void setFridgeProductName(String fridgeProductName) {
        this.fridgeProductName = fridgeProductName;
    }

    public int getFridgeProductAmount() {
        return fridgeProductAmount;
    }

    public void setFridgeProductAmount(int fridgeProductAmount) {
        this.fridgeProductAmount = fridgeProductAmount;
    }

    @Override
    public String toString() {
        return "FridgeProduct{" +
                "fridgeProductName='" + fridgeProductName + '\'' +
                ", fridgeProductAmount=" + fridgeProductAmount +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fridgeProductName);
        parcel.writeInt(fridgeProductAmount);
    }
}
