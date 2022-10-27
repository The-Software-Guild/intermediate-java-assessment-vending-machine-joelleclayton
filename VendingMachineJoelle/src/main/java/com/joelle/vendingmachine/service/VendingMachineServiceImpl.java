package com.joelle.vendingmachine.service;

import com.joelle.vendingmachine.dao.AuditDao;
import com.joelle.vendingmachine.dao.AuditDaoImpl;
import com.joelle.vendingmachine.dao.VendingMachineDao;
import com.joelle.vendingmachine.dao.VendingMachineDaoImpl;
import com.joelle.vendingmachine.dao.VendingMachineException;
import com.joelle.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author JoelleClayton
 */
public class VendingMachineServiceImpl implements VendingMachineService {
    private VendingMachineDao dao;
    private AuditDao auditDao;
    public VendingMachineServiceImpl(VendingMachineDao dao, AuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }
    @Override
    public Item getItem(String name) throws VendingMachineException, VendingMachineItemInventoryException {
        //implement
        return null;
    }

    @Override
    public List<Item> listAllItems() throws VendingMachineException {
        return dao.listAllItems()
                .stream()
                .filter(item->item.getNumInventoryItems()>0)
                .collect(Collectors.toList());
    }

    @Override
    public Item addItem(Item item) throws VendingMachineException {
        //implement
        return null;
    }

    @Override
    public Item removeItem(Item item) throws VendingMachineException {
        //implement
        return null;
    }

    @Override
    public Item changeInventoryCount(Item item, int newCount) throws VendingMachineException {
        //implement
        return null;
    }

    @Override
    public BigDecimal sellItem(BigDecimal totalFunds, Item item) throws VendingMachineException, VendingMachineItemInventoryException, VendingMachineInsufficientFundsException {
        //implement
        return null;
    }
}
