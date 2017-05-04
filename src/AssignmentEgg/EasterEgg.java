package AssignmentEgg;

import java.util.Scanner;

/*
 * Steven Allen
 * ITSE-1302
 * Assignment EasterEgg
 * Code creates basket of eggs that can be decorated.
 */

public class EasterEgg {

    private String chrOutput;
    private static int intEggCount = 1;

    private EasterEgg(){
        UserInput();
        intEggCount++;
        chrOutput = "#";
    }

    private void UserInput(){
        Scanner objInput = new Scanner(System.in);
        System.out.println("Choose a character " + intEggCount);
        setSymbol(objInput.next().charAt(0));
    }

    private void setSymbol(char c) {
    }

    private String getSymbol(){
        return chrOutput;
    }

    private void setSymbol(String pchrOutput){
        switch (chrOutput = pchrOutput) {
        }
    }

    public String toString(){
        return ( "\n  __ \n" +
                " /" + getSymbol() + getSymbol() + "\\ \n" +
                "/" + getSymbol()  + getSymbol()  + getSymbol()  + getSymbol()  + "\\ \n" +
                "|" + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "|  \n" +
                "\\____/ \n\n");
    }

}
