/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660
 */

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static String convert(int number) {
        String result = "";
        Map<Integer, String> unitsMap = new HashMap<Integer, String>() { {
            put(0, ""); put(1, "I"); put(2, "II"); put(3, "III");
            put(4, "IV"); put(5, "V"); put(6, "VI");
            put(7, "VII"); put(8, "VIII"); put(9, "IX");
        } };

        Map<Integer, String> tensMap = new HashMap<Integer, String>() { {
            put(0, ""); put(10, "X"); put(20, "XX"); put(30, "XXX"); 
            put(40, "XL"); put(50, "L"); put(60, "LX"); 
            put(70, "LXX"); put(80, "LXXX"); put(90, "XC");
        } };
        Map<Integer, String> hundredsMap = new HashMap<Integer, String>() { {
            put(0, ""); put(100, "C"); put(200, "CC"); put(300, "CCC");
            put(400, "CD"); put(500, "D"); put(600, "DC");
            put(700, "DCC"); put(800, "DCCC"); put(900, "CM");
        }};

        Map<Integer, String> thousandsMap = new HashMap<Integer, String>() { {
            put(0, "");
            put(1000, "M"); put(2000, "MM"); put(3000, "MMM");
        }};

        int unit = number % 10;
        
        int tens = (number % 100) -  unit;

        int hundreds = (number % 1000) - tens - unit;

        int thousands =  (number % 10000) - hundreds - tens - unit;

        result = thousandsMap.get(thousands) +  hundredsMap.get(hundreds) + tensMap.get(tens) + unitsMap.get(unit);
        
        return result;
    }
}
