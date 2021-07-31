package solid.proxy;

interface PayBill {
    void payPhonePe(int amount);
    void payAmazon(int amount);
    void payGPay(int amount);
}

class PayBillImpl implements PayBill {

    @Override
    public void payPhonePe(int amount) {
        System.out.println("Paying through PhonePe - Amount : " + amount);
    }

    @Override
    public void payAmazon(int amount) {
        System.out.println("Paying through AmazonPay - Amount : " + amount);
    }

    @Override
    public void payGPay(int amount) {
        System.out.println("Paying through GooglePay - Amount : " + amount);
    }
}

class PayBillProxy extends PayBillImpl {
    private boolean isValidPhnNo = false;

    PayBillProxy(String phnNo) {
        if ("84215".equals(phnNo))
            isValidPhnNo = true;
        else
            System.out.println("No access for this Phone to pay amount...");
    }

    @Override
    public void payPhonePe(int amount) {
        if (isValidPhnNo)
            super.payPhonePe(amount);
    }

    @Override
    public void payAmazon(int amount) {
        if (isValidPhnNo)
            super.payAmazon(amount);
    }

    @Override
    public void payGPay(int amount) {
        if (isValidPhnNo)
            super.payGPay(amount);
    }
}

public class ProxyPatternDemo1 {
    public static void main(String[] args) {
        PayBill payBill = new PayBillProxy("84215");
        payBill.payPhonePe(100);
        payBill.payAmazon(500);
        payBill.payGPay(750);
    }
}
