package solid;

import jdk.nashorn.internal.runtime.ECMAException;

class Document{

}

interface Machine{
    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;
}

class MultifunctionPrinter implements Machine{

    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void fax(Document d) {
        //
    }

    @Override
    public void scan(Document d) {
        //
    }
}

class OldFashionPrinter implements Machine{

    @Override
    public void print(Document d) {
        // valid method
    }

    @Override
    public void fax(Document d) throws Exception {
        // not valid
        throw new Exception();
    }

    @Override
    public void scan(Document d) throws Exception {
        // not valid
        throw new Exception();
    }
}
 // now segregated interfaces are as follows
interface Printer{
    void Print(Document d) throws Exception;
 }

 interface Scanner{
    void scan(Document d) throws Exception;
 }

 interface MultifunctionDevice extends Printer, Scanner{

 }

 class JustPrinter implements Printer{

     @Override
     public void Print(Document d) throws Exception {

     }
 }

 class PhotoPrinter implements Printer,Scanner{

     @Override
     public void Print(Document d) throws Exception {

     }

     @Override
     public void scan(Document d) throws Exception {

     }
 }

 class MultiFunctionMachine implements MultifunctionDevice{



     @Override
     public void Print(Document d) throws Exception {

     }

     @Override
     public void scan(Document d) throws Exception {

     }
 }

public class InterfaceSegregationDemo {
}
