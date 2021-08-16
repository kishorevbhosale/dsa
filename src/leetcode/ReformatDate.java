package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public static void main(String[] args) {
        System.out.println(reformatDate("2th Jan 2052"));
    }

    public static String reformatDate(String date) {
        String[] dateSplit = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(dateSplit[2]).append("-");
        Map<String, String> map = new HashMap<String, String>() {{
            put("Jan", "01");
            put("Feb", "02");
            put("Mar", "03");
            put("Apr", "04");
            put("May", "05");
            put("Jun", "06");
            put("Jul", "07");
            put("Aug", "08");
            put("Sep", "09");
            put("Oct", "10");
            put("Nov", "11");
            put("Dec", "12");
        }};
        sb.append(map.get(dateSplit[1]) + "-");
        if (dateSplit[0].length() == 3) {
            sb.append("0" + dateSplit[0].charAt(0));
        } else {
            sb.append(dateSplit[0], 0, 2);
        }
        return sb.toString();
    }
}
