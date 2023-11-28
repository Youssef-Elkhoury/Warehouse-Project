package service;


import stock.Item;

import java.util.Date;

public class ItemService extends Item {

    public ItemService(String condition, String name, int quantity, Date manufacturingDate) {
        super(condition, name, quantity, manufacturingDate);
    }
}
