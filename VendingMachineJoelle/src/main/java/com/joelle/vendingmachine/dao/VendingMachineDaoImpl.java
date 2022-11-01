package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dto.Item;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author JoelleClayton
 */
public class VendingMachineDaoImpl implements VendingMachineDao {

    private List<Item> itemList = new ArrayList<>();
    FileDao fileDao;
    private static final String ITEM_FILE = "items.txt";

    private static final String DELIMITER = ",";

    public VendingMachineDaoImpl() throws VendingMachineException {
        fileDao = new FileDaoImpl();
        itemList = fileDao.readFile(ITEM_FILE);
    }

    @Override
    public Item getItem(int index) throws VendingMachineException {
        itemList = fileDao.readFile(ITEM_FILE);
        return itemList.get(index);
    }

    @Override
    public List<Item> listAllItems() throws VendingMachineException {
        itemList = fileDao.readFile(ITEM_FILE);
        return itemList;
    }

    @Override
    public void changeInventoryCount(int index, int newCount) throws VendingMachineException {
        itemList = fileDao.readFile(ITEM_FILE);
        itemList.get(index).setNumInventoryItems(newCount);
        fileDao.writeFile(itemList);

    }

}
