package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {

        DiscountedProduct oldFish = new DiscountedProduct("Старая рыба", 100, 5);
        DiscountedProduct sweetSalt = new DiscountedProduct("Сладкая соль", 30, 10);
        FixPriceProduct water = new FixPriceProduct("Вода");
        FixPriceProduct air = new FixPriceProduct("Воздух");
        SimpleProduct candy = new SimpleProduct("Конфеты", 240);
        SimpleProduct chicken = new SimpleProduct("Курица", 470);
        SimpleProduct tea = new SimpleProduct("Чай", 300);
        //
        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
        ProductBasket basket3 = new ProductBasket();
        ProductBasket basket4 = new ProductBasket();
        //
        System.out.println("basket1");
        basket1.addProduct(oldFish);
        basket1.addProduct(air);
        basket1.addProduct(chicken);
        basket1.printContents();
        //
        System.out.println("basket2");
        basket2.addProduct(sweetSalt);
        basket2.addProduct(water);
        basket2.addProduct(tea);
        basket2.printContents();
        //
        String newProduct2 = "чай";
        boolean found2 = basket3.checkingByName(newProduct2);
        System.out.println(newProduct2 + " " + found2);
        //
        basket4.addProduct(candy);
        basket4.addProduct(chicken);
        basket4.addProduct(tea);
        basket4.clear();
        basket4.printContents();
        int emptyBasketCost = basket4.printContents();
        System.out.println("стоимость корзины: " + emptyBasketCost);
        String newProduct3 = "Хлеб";
        boolean found3 = basket4.checkingByName(newProduct3);
        System.out.println(newProduct3 + " " + found3);
    }
}