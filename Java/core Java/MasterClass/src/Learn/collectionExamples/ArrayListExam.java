package Learn.collectionExamples;

import java.io.*;
import java.util.*;

public class ArrayListExam {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        for (byte b = 10; b>0;b--){
            al.add((int)b);
        }

        // print using for each loop
        System.out.println("\nPrinting using for each loop");
        for (Integer i: al){
            System.out.print(i);
        }


        // print using iterator
        System.out.println("\nUsing Iterator to print arraylist");
        Iterator<Integer> ite = al.iterator();
        while (ite.hasNext()){
            System.out.print(ite.next());
        }

        // print using listIterator
        ListIterator<Integer> liter = al.listIterator();
        System.out.println("using list iterator to print arraylist");
        while(liter.hasNext()){
            System.out.println(liter.next());
        }
        al.set(0,56);

        System.out.println(al.get(1));

        // sort arrayList
        Collections.sort(al);
        System.out.println("\nSorted arraylist using collection");
        System.out.println(al);

        //Traversing list in reverse order
        ListIterator<Integer> rever = al.listIterator(al.size());
        while (rever.hasPrevious()){
            System.out.println(rever.previous());
        }

        // foreach method
        System.out.println("ForEach method in arraylist");

        al.forEach(System.out::println);

        // for each remainin
        ite = al.iterator();
        Integer i = ite.next();
        ite.forEachRemaining(System.out::println);


        // Serialization and Deserialization
        try {
            System.out.println("Serialize the ArrayList");
            FileOutputStream fos = new FileOutputStream("ArrayListObject");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("ArrayListObject");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Integer> all = (ArrayList)ois.readObject();
            System.out.println(all);
            all.remove(Integer.valueOf(678));
        } catch (IOException | ClassNotFoundException io){
            System.out.println(io);
        }

        System.out.println("Retain all");
        // Retain all
        ArrayList<Integer> small = new ArrayList<>(al.subList(0,5));
        System.out.println(small);
        System.out.println(al);
        al.retainAll(small);
        System.out.println(al);

        al.add(null);
        System.out.println(al);
    }
}
