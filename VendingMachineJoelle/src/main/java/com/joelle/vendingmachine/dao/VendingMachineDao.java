package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dto.Item;
import java.util.List;

/**
 *
 * @author JoelleClayton
 */
public interface VendingMachineDao {
    Item getItem(String name) throws VendingMachineException;
    List<Item> listAllItems() throws VendingMachineException;
    Item addItem(Item item) throws VendingMachineException;
    Item removeItem(Item item) throws VendingMachineException;
    Item changeInventoryCount(Item item, int newCount) throws VendingMachineException;
}
