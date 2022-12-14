package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        } else {
            return rsl;
        }
    }

    public static void main(String[] args) {
        String[] el = new String[] {"one", "two", "three"};
        String key = "four";
        try {
            System.out.println("index=" + indexOf(el, key));
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}