package leetcode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(10));
        System.out.println(convertToTitle(71));
        System.out.println(convertToTitle(102));
        System.out.println(convertToTitle(1234567));
        System.out.println(convertToTitle(876545671));
    }

    public static String convertToTitle(int columnNumber) {
        if (columnNumber==26) return "Z";
        StringBuilder sb = new StringBuilder();
        int div = columnNumber, rem = 0;
        do {
            rem = div % 26;
            div = div / 26;
            if (rem == 0 ) {
                sb.append("Z");
                div = div-1;
            }else{
                sb.append((char)(rem + 64));
            }
        } while (div >0);
        return sb.reverse().toString();
    }
}
