package com.group.libraryapp.controller.book;

import com.group.libraryapp.service.book.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

//    private BookService bookService =new BookService(); 원래는 이렇게 함
    private final BookService bookService;
// 10번째 줄 주석 처럼 안하고 빈 을 사용하니 아래 처럼 생성자 만듦

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public void saveBook(){
        bookService.saveBook();
    }
}
