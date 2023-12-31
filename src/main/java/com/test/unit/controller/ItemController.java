package com.test.unit.controller;

import com.test.unit.model.Item;
import com.test.unit.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item dummyItemFromBusinessService() {
        return itemService.getHardcodedItemDate();
    }

    @GetMapping("/items-from-database")
    public List<Item> dummyItemsfromDatabase() {
        return itemService.getAllItems();
    }
}
