package org.skypro.skyshop.product;


public class SimpleProduct extends Product {

    private int getProductPrice;

    public SimpleProduct(String nameProduct, int getProductPrice) {
        super(nameProduct);
        this.getProductPrice();
        this.getProductPrice = getProductPrice;
    }

    @Override
    public int getProductPrice() {
        return getProductPrice;
    }

    public boolean isSpecial() {
        return false;
    }

}
