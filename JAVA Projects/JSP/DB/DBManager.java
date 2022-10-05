package kz.JSP.DB;

import kz.JDBC.DB.Student;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Item> items = new ArrayList<>();
    public static int count = 8;

    static {
        items.add(new Item(1, "iPhone 13 Pro Max 128 Gb", 450000, 15));
        items.add(new Item(2, "Xiaomi Redmi NOTE 8 256 Gb", 250000, 45));
        items.add(new Item(3, "OPPO Reno 7 128 Gb", 220000, 65));
        items.add(new Item(4, "iPhone 13 Pro 128 Gb", 410000, 85));
        items.add(new Item(5, "iPhone 13 128 Gb", 350000, 26));
        items.add(new Item(6, "Samsung S21 EDGE 228 Gb", 440000, 33));
        items.add(new Item(7, "iPhone 13 Pro Max 512 Gb", 550000, 25));
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void addItem(Item item) {
        item.setId(count);
        count++;
        items.add(item);

    }

    public static Item getItem(int id) {
        for (Item I : items) {
            if (I.getId() == id) {
                return I;
            }
        }
        return null;
    }
}

