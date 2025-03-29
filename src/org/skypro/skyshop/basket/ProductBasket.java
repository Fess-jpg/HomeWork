package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private int count;

    public ProductBasket() {
        this.products = new Product[5];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");

        }
    }

    public int printContents() {
        if (count == 0) {
            System.out.println(" в корзине пусто ");
        } else {
            int totalCost = 0;
            int specialCount = 0;
            for (int i = 0; i < count; i++) {
                System.out.println(products[i]);
                totalCost += products[i].getProductPrice();
                if (products[i].isSpecial()) {
                    specialCount++;
                }
            }
            System.out.println("Итого: " + totalCost);
            System.out.println("Специальных товаров: " + specialCount);
        }
        return count;
    }

    public boolean checkingByName(String productName) {
        for (int i = 0; i < count; i++) {
            if (products[i].getNameProduct().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }
}







