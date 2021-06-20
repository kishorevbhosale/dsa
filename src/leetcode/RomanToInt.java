package leetcode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToIntV1("MCMXCIV"));
        System.out.println(romanToIntV2("IX"));
    }

    public static int romanToIntV1(String s) {
        HashMap<String, Integer> hm = getStringIntegerHashMap();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if ((i + 1) < s.length()
                    && hm.get(((Character) s.charAt(i)).toString()) < hm.get(((Character) s.charAt(i + 1)).toString())) {
                sb.append(s.charAt(i));
                sb.append(s.charAt(i + 1));
                result += hm.get(sb.toString());
                i++;
            } else {
                result += hm.get(((Character) s.charAt(i)).toString());
            }
        }
        return result;
    }

    private static HashMap<String, Integer> getStringIntegerHashMap() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("IV", 4);
        hm.put("V", 5);
        hm.put("IX", 9);
        hm.put("X", 10);
        hm.put("XL", 40);
        hm.put("L", 50);
        hm.put("XC", 90);
        hm.put("C", 100);
        hm.put("CD", 400);
        hm.put("D", 500);
        hm.put("CM", 900);
        hm.put("M", 1000);
        return hm;
    }

    public static int romanToIntV2(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String sb = "";
            if ((i + 1) < s.length() && getCharValue(s.charAt(i)) < getCharValue(s.charAt(i + 1))) {
                sb = sb + s.charAt(i);
                sb = sb + s.charAt(i + 1);
                result += getStrValue(sb);
                i++;
            } else {
                result += getCharValue(s.charAt(i));
            }
        }
        return result;
    }

    private static int getCharValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static int getStrValue(String c) {
        switch (c) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }
}
