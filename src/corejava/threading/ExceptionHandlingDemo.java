package corejava.threading;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

class MyExceptionV1 extends RuntimeException{
    MyExceptionV1(String s, int n){
        super(s);
        System.out.println("Exception : "+s+" Exception occured because of number :"+n);
    }
}
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try{
            int n = 10;
            if (n==10)
                throw new MyExceptionV1("Divide by zero exception raised..", n);
        }catch (Exception e){
            System.out.println("take another nnumber : "+e);
            throw new NullPointerException();
        }
    }
}
