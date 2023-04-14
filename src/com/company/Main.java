package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private int size;

    public static void main(String[] args) {


        ArrayList<Book> bookList= new ArrayList();

        bookList.add(new Book("Suç ve ceza",300,"Dostoyevski",1000));
        bookList.add(new Book("Satranç",90,"Stefan Zweig",1100));
        bookList.add(new Book("Küçük Prens",500,"Antoniede",1200));
        bookList.add(new Book("Dönüşüm",80,"Franz Kafka",1300));
        bookList.add(new Book("Simyacı",350,"Paulo Chelho",1400));
        bookList.add(new Book("Kuyucaklı yusuf",85,"Sabahattin Ali",1500));
        bookList.add(new Book("1984",290,"George Orwell",1600));
        bookList.add(new Book("Serenad",380,"Zülfü Livaneli",1700));
        bookList.add(new Book("Yabancı",42,"Albert Camus",1800));
        bookList.add(new Book("Çalıkuşu",340,"Reşat Nuri Güntekin",1900));

        Map<String,String> mapBL=new HashMap<String, String>();

        bookList.forEach(book -> mapBL.put(book.getBookName(),book.getYazarName()));
        for (String i: mapBL.values()){
            System.out.println(i);
        }
        System.out.println("--------------------------");
        List<Book> newBL=new ArrayList<>();
        bookList.stream().filter(book -> book.getSayfaSayisi()>100).forEach(newBL::add);

       // List<Book> newBLL=bookList.stream().filter(book -> book.getSayfaSayisi()>100).collect(Collectors.toList());

        newBL.forEach(book -> System.out.println(book.getBookName()));

    }
}
