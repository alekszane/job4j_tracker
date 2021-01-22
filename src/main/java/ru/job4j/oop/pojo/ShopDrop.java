package ru.job4j.oop.pojo;

import ru.job4j.oop.Product;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int j = i; j < products.length; j++) {
                    if (products[j] != null) {
                        products[i] = products[j];
                        products[j] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}
