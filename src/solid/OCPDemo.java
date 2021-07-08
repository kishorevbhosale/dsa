package solid;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

enum Color{
    RED,BLUE,GREEN
}

enum Size{
    SMALL, MEDIUM, LARGE;
}

class Product{
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}

class ProductFilter{
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.color==color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.size==size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size){
        return products.stream().filter(p -> p.color==color && p.size==size);
    }
}

public class OCPDemo {
    public static void main(String[] args) {
        Product apple = new Product("APPLE", Color.GREEN, Size.SMALL);
        Product tree = new Product("TREE", Color.GREEN, Size.LARGE);
        Product house = new Product("HOUSE", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple,tree,house);

        ProductFilter pf = new ProductFilter();
        System.out.println("old filter : ");
        pf.filterByColor(products, Color.GREEN).forEach(product -> System.out.println(product.name +" is green"));
        pf.filterBySize(products, Size.LARGE).forEach(product -> System.out.println(product.name+" is large"));
        pf.filterByColorAndSize(products, Color.BLUE, Size.LARGE).forEach(product -> System.out.println(product.name+" is large and blue"));


        System.out.println("New Filter : ");
        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large products:");
        bf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        System.out.println("Large blue items:");

        System.out.println("Large blue items:");
        bf.filter(products,
                new allSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));

    }
}

// Below code for Open-extension closed-modification principle

interface Specification<T> {
    boolean isSatisfied(T item);
}

interface Filter<T>{
    Stream<T> filter(List<T> item, Specification<T> spec);
}

class ColorSpecification implements Specification<Product>{
    private  Color color;

    public ColorSpecification(Color color){
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color==color;
    }
}

class SizeSpecification implements Specification<Product>{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.size==size;
    }
}

class allSpecification<T> implements Specification<T>{
    private Specification<T> first, second;

    public allSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}

class BetterFilter implements Filter<Product>{
    @Override
    public Stream<Product> filter(List<Product> item, Specification<Product> spec) {
        return item.stream().filter(spec::isSatisfied);
    }
}
