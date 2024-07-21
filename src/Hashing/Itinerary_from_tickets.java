package Hashing;

import java.util.HashMap;

public class Itinerary_from_tickets {
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : tick.keySet()) {
            revmap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("Mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);
        if (start == null) {
            System.out.println("No valid starting point found");
            return;
        }

        while (tickets.containsKey(start)) {
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
