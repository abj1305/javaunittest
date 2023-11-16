package com.test.unit.service;

import com.test.unit.model.Item;
import com.test.unit.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    private ItemRepository repository;

    @InjectMocks
    private ItemService service;

    @Test
    void getAllItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Ball", 10, 100));
        items.add(new Item(2, "Balll", 20, 200));
        when(repository.findAll()).thenReturn(items);

        List<Item> result = service.getAllItems();
        assertEquals(1000, result.get(0).getValue());
        assertEquals(4000, result.get(1).getValue());
    }
}