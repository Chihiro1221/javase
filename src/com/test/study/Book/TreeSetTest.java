package com.test.study.Book;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> items = new TreeSet<>();
        items.add(new Item("Toaster",1234));
        items.add(new Item("Widget",4562));
        items.add(new Item("Modem",9912));

        System.out.println(items);

        TreeSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(items);
        System.out.println(sortByDescription);
    }
}

class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    @Override
    public int compareTo(Item o) {
        int compare = Integer.compare(this.partNumber, o.partNumber);
        return compare != 0 ? compare : this.description.compareTo(o.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }
}
