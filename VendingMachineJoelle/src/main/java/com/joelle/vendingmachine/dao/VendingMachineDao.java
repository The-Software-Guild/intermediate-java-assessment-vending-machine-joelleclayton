package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dao.VendingMachineException;
import com.joelle.vendingmachine.dto.Item;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JoelleClayton
 */
public interface VendingMachineDao {
    Item getItem(int index) throws VendingMachineException;
    List<Item> listAllItems() throws VendingMachineException;
    void changeInventoryCount(int index, int newCount) throws VendingMachineException;


}
