package org.skypro.skyshop.product;

import org.skypro.skyshop.Article.Searchable;

abstract public class Product implements Searchable {
    private final String nameProduct;

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

    @Override
    public String getSearchTerm() {
        return nameProduct;
    }


    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return nameProduct;
    }
}


