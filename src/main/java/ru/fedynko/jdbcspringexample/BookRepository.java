package ru.fedynko.jdbcspringexample;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAllBooks();

    Optional<Book> findById(Long id);
}
