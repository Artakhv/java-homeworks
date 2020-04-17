package javaBasic.EXERCISES_4;

public class Main {
    public static void main(String[] args) {

        IList<Integer> list = new MyArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(3,6);
//        Integer[] arr = list.toArray();

        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

        list.remove(4);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
