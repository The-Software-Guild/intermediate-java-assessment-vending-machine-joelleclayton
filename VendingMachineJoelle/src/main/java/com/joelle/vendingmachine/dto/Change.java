package com.joelle.vendingmachine.dto;

import com.joelle.vendingmachine.service.VendingMachineInsufficientFundsException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;

/**
 *
 * @author JoelleClayton
 */
public class Change {

    private HashMap<Coins, Integer> coinChangeMap = new HashMap<>();

    public Change() {

    }

    public HashMap<Coins, Integer> getChange(BigDecimal funds) throws VendingMachineInsufficientFundsException {
        //implement
        return null;
    }


    public HashMap<Coins, Integer> getCoinChangeMap() {
        return coinChangeMap;
    }

    public void setCoinChangeMap(HashMap<Coins, Integer> coinChangeMap) {
        this.coinChangeMap = coinChangeMap;
    }
}
