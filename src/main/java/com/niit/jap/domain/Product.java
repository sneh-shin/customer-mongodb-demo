/*
 *Author Name: Sneha Shinde
 *Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.domain;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;

    public Product() {
    }

    public Product(int productId, String productName, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
