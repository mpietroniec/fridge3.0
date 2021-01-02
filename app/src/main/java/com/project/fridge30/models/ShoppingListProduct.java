package com.project.fridge30.models;

public class ShoppingListProduct {
    private String shoppingListProductName;
    private int shoppingListProductAmount;
    private String shoppingListShopName;

    public ShoppingListProduct(String shoppingListProductName, int shoppingListProductAmount, String shoppingListShopName) {
        this.shoppingListProductName = shoppingListProductName;
        this.shoppingListProductAmount = shoppingListProductAmount;
        this.shoppingListShopName = shoppingListShopName;
    }

    public ShoppingListProduct() {
    }

    public String getShoppingListProductName() {
        return shoppingListProductName;
    }

    public void setShoppingListProductName(String shoppingListProductName) {
        this.shoppingListProductName = shoppingListProductName;
    }

    public int getShoppingListProductAmount() {
        return shoppingListProductAmount;
    }

    public void setShoppingListProductAmount(int shoppingListProductAmount) {
        this.shoppingListProductAmount = shoppingListProductAmount;
    }

    public String getShoppingListShopName() {
        return shoppingListShopName;
    }

    public void setShoppingListShopName(String shoppingListShopName) {
        this.shoppingListShopName = shoppingListShopName;
    }

    @Override
    public String toString() {
        return "ShoppingListProduct{" +
                "shoppingListProductName='" + shoppingListProductName + '\'' +
                ", shoppingListProductAmount='" + shoppingListProductAmount + '\'' +
                ", shoppingListShopName='" + shoppingListShopName + '\'' +
                '}';
    }
}
