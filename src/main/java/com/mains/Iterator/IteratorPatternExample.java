package com.mains.Iterator;


public class IteratorPatternExample {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.addItem("Item 1");
        collection.addItem("Item 1");
        collection.addItem("Item 1");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
