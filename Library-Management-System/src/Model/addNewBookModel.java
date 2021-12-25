package model;

import Dao.BookDao;

public class addNewBookModel {
    private String bookNumber;
    private String bookName;
    private String author;
    private String publisher;
    private String quantity;

    public addNewBookModel() {
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String addNewBook() {
        String check;
        int bookQuantity = Integer.parseInt(quantity);
        check = BookDao.save(bookNumber,bookName,author,publisher,bookQuantity);
        return check;
    }
}
