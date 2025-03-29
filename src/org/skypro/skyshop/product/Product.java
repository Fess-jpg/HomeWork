package org.skypro.skyshop.product;

abstract public class Product {
    private String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    abstract public int getProductPrice();

    @Override
    public String toString() {
        return nameProduct + ": " + getProductPrice();
    }

    public abstract boolean isSpecial();

}

