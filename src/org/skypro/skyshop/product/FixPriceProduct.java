package org.skypro.skyshop.product;

public class FixPriceProduct extends Product  {

    private static final int FIXED_PRICE = 1000;

    public FixPriceProduct(String nameProduct) {
        super(nameProduct);
    }

    @Override
    public int getProductPrice() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": Фиксированная цена " + FIXED_PRICE;
    }

    public boolean isSpecial() {
        return true;
    }

    @Override
    public String getSearchTerm() {
        return super.getSearchTerm();
    }
}
