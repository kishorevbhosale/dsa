package leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("10", "110010")); //"110100"

    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] charA = sb.append(a).reverse().toString().toCharArray();
        sb = new StringBuilder();
        char[] charB = sb.append(b).reverse().toString().toCharArray();
        sb = new StringBuilder();
        int lenA = charA.length;
        int lenB = charB.length;
        int minlen = Math.min(lenA, lenB);
        char carry = '0';
        for (int i = 0; i < minlen; i++) {
            if (charA[i]!=charB[i]) {
                if (carry == '0') {
                    sb.append("1");
                    carry='0';
                }
                else {
                    sb.append("0");
                    carry='1';
                }
            } else if (charA[i] == '0') {
                if (carry == '0') sb.append("0");
                else sb.append("1");
                carry = '0';
            } else if (charA[i] == '1') {
                if (carry == '0') sb.append("0");
                else sb.append("1");
                carry = '1';
            }
        }
        if (lenA == lenB && carry == '1') sb.append("1");
        else {
            if (minlen == lenA) carry = getCarry(sb, charB, lenB, minlen, carry);
            else carry = getCarry(sb, charA, lenA, minlen, carry);
            if (carry=='1') sb.append(1);
        }
        return sb.reverse().toString();
    }

    private static char getCarry(StringBuilder sb, char[] chars, int len, int minlen, char carry) {
        for (int i = minlen; i < len; i++) {
            if (chars[i] != carry) {
                sb.append("1");
                carry = '0';
            } else if (chars[i] == carry) {
                sb.append("0");
                carry = chars[i];
            }
        }
        return carry;
    }

    public static String addBinaryV1Easy(String a, String b){
        String result = "";
        int sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || sum == 1)
        {
            //System.out.println("sum = "+sum+" a :"+ (a.charAt(i) - 48)+" b :"+(a.charAt(i) - 48) );
            sum += (i >= 0) ? a.charAt(i--) - 48 : 0;
            sum += (j >= 0) ? b.charAt(j--) - 48 : 0;
            result = (char)(sum % 2 + 48) + result;
            sum /= 2;

        }

        return result;
    }
}
