package class5.exs2;

import java.rmi.NoSuchObjectException;

public class Main {
  public static void main(String[] args) throws NoSuchObjectException {
    Stock stock = new Stock();

    for (int i = 0; i < 10; i++) {
      stock.addItem();
    }
    stock.items.sort(Item::compareTo);

    System.out.println("\nItems in stock:");
    stock.items.forEach(System.out::println);

    System.out.println("\nList of expiry items:");
    stock.expiredItemList().forEach(System.out::println);

    System.out.println("\nThe item with the closest expiry date:");
    System.out.println(stock.closestExpiryDateItem());

    System.out.println("\nList of items sorted alphabetically:");
    stock.sortedAlphabeticallyItemList().forEach(System.out::println);

    System.out.println("\nAdd item with the name 'cup':");
    stock.addItemByName("cup");

    System.out.println("Get item by name:");
    System.out.println(stock.getItemByName("cup"));

    System.out.println("\nNames of items that above weight of 10g:");
    stock.itemsAboveWeight(10).forEach(System.out::println);

    System.out.println("\nHashMap of sum of items with the same type:");
    System.out.println(stock.sumItemsWithSameType());
  }
}
