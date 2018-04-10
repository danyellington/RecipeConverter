package com.epicodus.recipeconverter.models;


public class Recipe {

    private String ingredientType;
    private int quantity;
    private int ingredientAmount;
    private String pushId;



    public Recipe(String ingredientType, int quantity, int ingredientAmount) {
        this.ingredientType = ingredientType;
        this.quantity = quantity;
        this.ingredientAmount = ingredientAmount;
        this.pushId = pushId;

    }

    public String getIngredientType() {
        return this.ingredientType;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getIngredientAmount() {
       return this.ingredientAmount;
    }

    public String getPushId() { return pushId; }

    public void setPushId(String pushId){
        this.pushId = pushId;
    }
}
