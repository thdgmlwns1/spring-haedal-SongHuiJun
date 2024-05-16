package com.group.libraryapp.service.book;

import com.group.libraryapp.repository.book.BookMemoryRepository;
import com.group.libraryapp.repository.book.BookMySqlRepository;
import com.group.libraryapp.repository.book.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
//    private final BookRepository bookRepository
//            =new BookMySqlRepository(); 이런 식으로 하면 메모리 레포지토리를 쓸려면 다 바꿔야함
    //그래서 아래 처럼 컨테이너가 할 수 있게한다.
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(){
        bookRepository.saveBook();
    }
}
