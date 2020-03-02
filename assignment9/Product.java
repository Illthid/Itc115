package com.Illithid;

import java.text.NumberFormat;

public class Product {
    private int productCode;
    private String productDescription;
    private double productPrice;
    private int count;

    // default values
    public Product() {
        this(0, "N/A", 0.00, 0);
    }

    public Product(int productCode, String productDescription, double productPrice, int count) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.count = count;
    }

    public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
        return formattedPrice;
    }

    public String toString() {
        return "Product Code: " + productCode + "\n" + "Product Description " + productDescription + "\n"
                + "Product Price: " + getPriceFormatted() + "\n" + "Product Count: " + count;
    }

    // getter&setter
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCount() {
        return count;
    }

    public void setProductCount(int count) {
        this.count = count;
    }

}