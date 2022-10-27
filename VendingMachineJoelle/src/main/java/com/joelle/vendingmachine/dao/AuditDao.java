package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dao.VendingMachineException;

/**
 *
 * @author JoelleClayton
 */
public interface AuditDao {
    public void writeAuditEntry(String entry) throws VendingMachineException;
}
