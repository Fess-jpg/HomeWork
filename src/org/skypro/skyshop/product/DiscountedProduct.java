package org.skypro.skyshop.product;

public class DiscountedProduct extends Product  {
    private int theBasicPrice;
    private int percentageDiscount;

    public DiscountedProduct(String nameProduct, int theBasicPrice, int percentageDiscount) {
        super(nameProduct);
        this.theBasicPrice = theBasicPrice;
        this.percentageDiscount = percentageDiscount;
    }

    @Override

    public int getProductPrice() {
        int basePrice = theBasicPrice * (100 - percentageDiscount) / 100;
        return basePrice;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": " + getProductPrice() + " (" + percentageDiscount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return percentageDiscount > 0;
    }

    @Override
    public String getSearchTerm() {
        return super.getSearchTerm();
    }
}
