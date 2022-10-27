package com.joelle.vendingmachine.controller;

import com.joelle.vendingmachine.dao.VendingMachineException;
import com.joelle.vendingmachine.dto.Change;
import com.joelle.vendingmachine.dto.Coins;
import com.joelle.vendingmachine.dto.Item;
import com.joelle.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.joelle.vendingmachine.service.VendingMachineItemInventoryException;
import com.joelle.vendingmachine.service.VendingMachineService;
import com.joelle.vendingmachine.service.VendingMachineServiceImpl;
import com.joelle.vendingmachine.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author JoelleClayton
 */


public class VendingMachineController {

    private VendingMachineView view;
    private VendingMachineService service;

    public VendingMachineController() throws VendingMachineException {
        //implement
    }

    public VendingMachineController(VendingMachineView view, VendingMachineService service) {
        //implement
    }

    public void run() {
        BigDecimal balance = new BigDecimal(0.0);
        boolean start = true;
        try {
            while(start) {
                view.printMenu();
                view.displayBalance(balance);
                String operation = view.getMenuSelection();
                switch(operation) {
                    case "1": //add funds
                        balance = addFunds(balance);
                        break;
                    case "2": //buy items
                        try {
                            balance = buyItems(balance);
                        } catch(VendingMachineItemInventoryException | VendingMachineInsufficientFundsException e) {
                            view.displayBalance;
                            view.displayErrorMessage(e.getMessage());
                        }
                        break;
                    case "3": //quit
                        try {
                            quit(balance);
                        } catch(VendingMachineInsufficientFundsException e) {
                            view.displayBalance(balance);
                            view.displayErrorMessage(e.getMessage());
                        }
                        start = false;
                        break;
                    default:
                        view.displayUnknownCommand();
                }
            }
            } catch (VendingMachineException e) {
            //implement
            }

            view.displayQuitMessage();
        }

        public BigDecimal addFunds(BigDecimal balance) {
           //implement
            return null;
        }

        public BigDecimal buyItems(BigDecimal balance) throws VendingMachineException, VendingMachineItemInventoryException, VendingMachineInsufficientFundsException {
            //implement
            return null;
        }

        public void quit(BigDecimal balance) throws VendingMachineInsufficientFundsException {
            //implement
        }
}
