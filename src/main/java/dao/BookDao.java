package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Book;

import java.util.List;

public interface BookDao {

    //增加一个Books
    int addBook(Book books);

    //根据id删除Books
    int deleteBookByID(@Param("bookID") int id);

    //更新Books
    int updateBook(Book books);

    //根据id查询Book
    Book queryBookByID(@Param("bookID") int bookID);

    List<Book> queryBookByName(String bookName);

    //查看全部的Book
    List<Book> queryAllBook();

}