package com.joelle.vendingmachine.service;

import com.joelle.vendingmachine.dao.VendingMachineException;
import com.joelle.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author JoelleClayton
 */
public interface VendingMachineService {
    Item getItem(String name) throws VendingMachineException,VendingMachineItemInventoryException;
    List<Item> listAllItems() throws VendingMachineException;
    Item addItem(Item item) throws VendingMachineException;
    Item removeItem(Item item) throws VendingMachineException;
    Item changeInventoryCount(Item item, int newCount) throws VendingMachineException;
    BigDecimal sellItem(BigDecimal totalFunds, Item item) throws VendingMachineException, VendingMachineItemInventoryException, VendingMachineInsufficientFundsException;
}
