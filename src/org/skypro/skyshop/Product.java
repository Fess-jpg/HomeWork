package org.skypro.skyshop;

public class Product {
    private String nameProduct;
    private int productPrice;

    public Product(String nameProduct, int productPrice) {
        this.nameProduct = nameProduct;
        this.productPrice = productPrice;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return nameProduct + ": цена " + productPrice;
    }
}

