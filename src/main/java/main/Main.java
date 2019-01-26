package main;

import DAO.BookDao;
import model.Book;
import org.springframework.context.annotation.*;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Main.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //zapisujemy
        Book book = new Book("1234567890468", "Spring is so cool", "Slawek");
        bookDao.save(book);
        //odczytujemy
        Book bookGet = bookDao.get(1L);
        System.out.println(bookGet);
        ctx.close();
    }
}