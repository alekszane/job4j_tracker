package ru.job4j.oop.pojo;

import ru.job4j.oop.Product;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        //products[index] = null;
        for (int i = 0; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
