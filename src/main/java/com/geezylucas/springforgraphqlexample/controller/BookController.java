package com.geezylucas.springforgraphqlexample.controller;

import com.geezylucas.springforgraphqlexample.dto.BookDTO;
import com.geezylucas.springforgraphqlexample.dto.CreateBookDTO;
import com.geezylucas.springforgraphqlexample.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @QueryMapping
    public Mono<BookDTO> bookById(@Argument Integer id) {
        return bookService.findByBookId(id);
    }

    @QueryMapping
    public Flux<BookDTO> allBooks() {
        return bookService.findAllBooks();
    }

    @MutationMapping
    public Mono<BookDTO> createBook(@Argument CreateBookDTO createBook) {
        return bookService.createBook(createBook);
    }
}