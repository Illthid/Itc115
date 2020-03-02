package com.Illithid;

public class ProductMain {

    public static void main(String[] args) {

        // (0, "N/A", 0.00, 0)

        System.out.println("A 16 ounce bottle of water! ");
        Product water = new Product(1, "A Generic bottle of Water", 0.99, 32);
        System.out.println(water);

        System.out.println();

        System.out.println("A 20oz bottle of fruit punch Gatorade, Stay hydrated");
        Product FPGatorade = new Product(2, "Fruit punch gatorade, 20oz", 13.99, 15);
        System.out.println(FPGatorade);

        System.out.println();

        System.out.println("A 20oz bottle of fruit punch Powerade! ");
        Product FPPowerade = new Product(3, "Fruit punch powerade, 20oz", 6.99, 30);
        System.out.println(FPPowerade);

    }

}