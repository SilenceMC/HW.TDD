import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();


    public int add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        return phoneBook.size();
    }

    public String findByNumber(String phoneNumber) {
        return phoneBook.entrySet()
                .stream()
                .filter(x -> x.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }

    public Set<String> printAllNames() {
        return phoneBook.keySet();
    }
}
