package class5.exs2;

import java.rmi.NoSuchObjectException;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {
    List<Item> items;
    Stock (){items=new ArrayList<>();}
    protected void addItem()
    {
        items.add(new Item());
    }

    protected List<Item> expiredItemList ()
    {
        return(items.stream().filter(student -> student.getDate().isBefore(LocalDate.now())).collect(Collectors.toList()));

    }
    protected List<Item> sortedAlphabeticallyItemList ()
    {
        items.sort(Comparator.comparing(Item::getName));
        return new ArrayList<>(items);


    }
    protected Item getItemByName(String name)
    {
        Item item= items.stream().filter(it->it.getName().equals(name)).findFirst().orElse(null);
        if (item==null)
            throw new IllegalArgumentException (String.format("'%s' item doesn't exists",name).toString());
        return new Item(item);
    }
    protected Optional<Item> closestExpiryDateItem() throws NoSuchObjectException {
        Optional<Item> item = items.stream().filter(it -> it.getDate().isAfter(LocalDate.now())).min(Item::compareTo);
        if (item==null)
            throw new NoSuchObjectException("There no items in list");
        return item;

    }

    protected void addItemByName(String name)
    {
        items.add(new Item(name));
    }

    protected List<String> itemsAboveWeight(float weight) {
        return(items.stream().filter(it -> it.getWeight() > weight).map(Item::getName).collect(Collectors.toList()));
    }

    protected HashMap<Item.Types, Long> sumItemsWithSameType()
    {
        HashMap<Item.Types, Long> map= new HashMap<>();
        Arrays.stream(Item.Types.values()).forEach(type->map.put(type, items.stream().filter(it -> it.getProductType()==type).count()));
        return new HashMap<>(map);
    }


}
