package solid.factory;

abstract class Computer {
    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "RAM = " + this.getRam() + ", HDD = " + this.getHdd() + ", CPU = " + getCpu();
    }
}

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("pc".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        }
        if ("server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        if ("laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, hdd, cpu);
        }
        return null;
    }
}
