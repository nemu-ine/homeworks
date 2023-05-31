package io.codelex.collections.practice.phonebook;

import java.util.HashMap;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<Integer, HashMap<String, String>> data;
    private int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<>();
        dataCount = 0;
    }

    private int find(String name) {
        for (int i = 0; i < dataCount; i++) {
            if (data.get(i).containsKey(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data.get(position).get(name);
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            data.get(i).replace(name, number);
        } else {
            HashMap<String, String> nameNumber = new HashMap<>();
            nameNumber.put(name, number);
            data.put(data.size(), nameNumber);
            dataCount++;
        }
    }

}
