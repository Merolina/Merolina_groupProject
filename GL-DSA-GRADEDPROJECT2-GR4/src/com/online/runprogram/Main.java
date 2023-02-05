package com.online.runprogram;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Krishnendra Paliwal
 *
 */
public class Main {

    public static int totalFloors;
    public static int[] totalFloorSize;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Driver myDriverObj = new Driver();
        myDriverObj.getInputs();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
}

