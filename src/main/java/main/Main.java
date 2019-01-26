package main;

import DAO.BookDao;
import DAO.BookDaoImpl;
import model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Main.class);
        BookDao bookDao = ctx.getBean(BookDao.class);

        Book book = new Book("1234567890468", "Spring is so cool", "Slawoir");
        bookDao.save(book);

        Book bookGet = bookDao.get(2L);
        System.out.println(bookGet);
        ctx.close();
    }
}