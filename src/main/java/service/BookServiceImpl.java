package service;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    // 组合

    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public int addBook(Book books) {
        return bookDao.addBook(books);
    }

    @Override
    public int deleteBookByID(int id) {
        return bookDao.deleteBookByID(id);
    }

    @Override
    public int updateBook(Book books) {
        return bookDao.updateBook(books);
    }

    @Override
    public Book queryBookByID(int bookID) {
        return bookDao.queryBookByID(bookID);
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return bookDao.queryBookByName(bookName);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }
}