package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dto.Item;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JoelleClayton
 */
public class VendingMachineDaoImpl implements VendingMachineDao {

    Map<String, Item> itemMap;
    FileDao fileDao;
    private static final String ITEM_FILE = "items.txt";

    public VendingMachineDaoImpl() throws VendingMachineException {
        fileDao = new FileDaoImpl();
        itemMap = fileDao.readFile(ITEM_FILE);
    }

    @Override
    public Item getItem(String name) throws VendingMachineException {
        itemMap = fileDao.readFile(ITEM_FILE);
        return itemMap.get(name);
    }

    @Override
    public List<Item> listAllItems() throws VendingMachineException {
        itemMap = fileDao.readFile(ITEM_FILE);
        return new ArrayList<>(itemMap.values());
    }

    @Override
    public Item addItem(Item item) throws VendingMachineException {
        itemMap = fileDao.readFile(ITEM_FILE);
        Item res = itemMap.put(item.getName(), item);
        fileDao.writeFile(new ArrayList<Item>(itemMap.values()));
        return res;
    }

    @Override
    public Item removeItem(Item item) throws VendingMachineException {
        itemMap = fileDao.readFile(ITEM_FILE);
        Item res = itemMap.remove(item.getName());
        fileDao.writeFile(new ArrayList<Item>(itemMap.values()));
        return res;
    }

    @Override
    public Item changeInventoryCount(Item item, int newCount) throws VendingMachineException {
        item.setNumInventoryItems(newCount);
        Item res = itemMap.put(item.getName(), item);
        fileDao.writeFile(new ArrayList<Item>(itemMap.values()));
        return res;
    }
}
