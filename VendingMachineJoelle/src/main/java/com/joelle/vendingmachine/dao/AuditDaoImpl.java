package com.joelle.vendingmachine.dao;

import com.joelle.vendingmachine.dao.AuditDao;
import com.joelle.vendingmachine.dao.VendingMachineException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author JoelleClayton
 */
public class AuditDaoImpl implements AuditDao {

    public static final String AUDIT_FILE = "audit.txt";

    @Override
    public void writeAuditEntry(String entry) throws VendingMachineException {
        //implement
    }
}
