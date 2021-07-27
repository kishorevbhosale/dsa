package solid.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "512GB", "2.4GHz");
        System.out.println("pc config : " + pc);
        Computer laptop = ComputerFactory.getComputer("laptop", "8GB", "1TB", "3.2GHz");
        System.out.println("laptop config : " + laptop);
        Computer server = ComputerFactory.getComputer("server", "64GB", "12TB", "4GHz");
        System.out.println("server config : " + server);
    }
}
