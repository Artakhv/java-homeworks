package javaBasic.EXERCISES_3;


import static javaBasic.EXERCISES_3.Util.append;

public class Basket {
    private String[] strings = new String[0];

    public void addString(final String string) {
        strings = append(strings, string);
    }

    @Override
    public String toString() {
        for (String string : strings) {
            System.out.println(string);
        }
        return String.format("Array length in %d", this.strings.length);
    }
}
