package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product candy = new Product("Конфеты", 240);
        Product tomato = new Product("Помидор", 70);
        Product bread = new Product("Хлеб", 50);
        Product chicken = new Product("Курица", 360);
        Product tea = new Product("Чай", 300);
        //
        ProductBasket basket1 = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
        ProductBasket basket3 = new ProductBasket();
        ProductBasket basket4 = new ProductBasket();
        //
        basket1.addProduct(candy);
        basket1.addProduct(tomato);
        basket1.addProduct(bread);
        basket1.addProduct(chicken);
        basket1.addProduct(tea);
        basket1.printContents();
        System.out.println();
        //
        basket2.addProduct(candy);
        basket2.addProduct(tomato);
        basket2.addProduct(bread);
        basket2.addProduct(chicken);
        basket2.addProduct(tea);
        basket2.addProduct(candy);
        basket2.printContents();
        //
        basket3.addProduct(candy);
        basket3.addProduct(chicken);
        String newProduct = "Конфеты";
        boolean found1 = basket3.checkingByName(newProduct);
        System.out.println(newProduct + " " + found1);
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
        int emptyBasketCost = basket4.getTotalCost();
        System.out.println("стоимость корзины: " + emptyBasketCost);
        String newProduct3 = "Хлеб";
        boolean found3 = basket4.checkingByName(newProduct3);
        System.out.println(newProduct3 + " " + found3);
    }
}