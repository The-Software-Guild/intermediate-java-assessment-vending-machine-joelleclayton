package com.joelle.vendingmachine.service;


/**
 *
 * @author JoelleClayton
 */
public class VendingMachineItemInventoryException extends Exception{
    public VendingMachineItemInventoryException(String msg){
        super(msg);
    }

    public VendingMachineItemInventoryException(String msg, Throwable cause){
        super(msg,cause);
    }
}
