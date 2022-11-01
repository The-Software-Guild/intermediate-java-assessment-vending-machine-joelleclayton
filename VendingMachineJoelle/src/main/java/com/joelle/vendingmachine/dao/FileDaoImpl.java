package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dao.FileDao;
import com.joelle.vendingmachine.dao.VendingMachineDaoImpl;
import com.joelle.vendingmachine.dao.VendingMachineException;
import com.joelle.vendingmachine.dto.Item;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoelleClayton
 */
public class FileDaoImpl implements FileDao {



    public final String ITEM_FILE = "items.txt";
    private static final String DELIMITER = ",";

    private List<Item> itemList = new ArrayList<>();




    @Override
    public Item unmarshallItem(String line) {
        // file structure <name>,<price>, <quantity>

        String[] itemTokens = line.split(DELIMITER);
        String itemName = itemTokens[1];
        BigDecimal itemCost = new BigDecimal(itemTokens[2]);
        int itemQuantity = Integer.parseInt(itemTokens[2]);
        Item itemFromFile = new Item(itemName, itemCost, itemQuantity);
        return itemFromFile;
    }

    @Override
    public String marshallItem(Item item) {
        return item.getName() + DELIMITER + item.getCost() + DELIMITER + item.getNumInventoryItems();
    }

    @Override
    public void writeFile(List<Item> itemList) throws VendingMachineException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ITEM_FILE));
        } catch (IOException e) {
            throw new VendingMachineException("Could not save item data", e);
        }
        String itemAsText;
        for (Item currentItem: itemList) {
            itemAsText = marshallItem(currentItem);
            out.println(itemAsText);
            out.flush();
        }
        out.close();


    }

    @Override
    public List<Item> readFile(String file) throws VendingMachineException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ITEM_FILE)));

            String currentLine;

            Item currentItem;

            while (scanner.hasNextLine()) {
                currentLine = scanner.nextLine();
                currentItem = unmarshallItem(currentLine);
                itemList.add(currentItem);

                scanner.close();
            }
            return itemList;
        } catch(FileNotFoundException e){
            throw new VendingMachineException("File not found", e);
        }
    }
}
