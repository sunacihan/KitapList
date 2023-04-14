package com.company;

public class Book {
    private String bookName;
    private int sayfaSayisi;
    private String yazarName;
    private int yayinTarihi;

    public Book(String bookName, int sayfaSayisi, String yazarName, int yayinTarihi) {
        this.bookName = bookName;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarName = yazarName;
        this.yayinTarihi = yayinTarihi;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarName() {
        return yazarName;
    }

    public void setYazarName(String yazarName) {
        this.yazarName = yazarName;
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}
