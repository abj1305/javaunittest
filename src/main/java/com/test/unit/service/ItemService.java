package com.test.unit.service;

import com.test.unit.model.Item;
import com.test.unit.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item getHardcodedItemDate() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> getAllItems() {
        List<Item> items = itemRepository.findAll();
        items.forEach(item -> {
            item.setValue(item.getPrice() * item.getQuantity());
        });
        return items;
    }
}
