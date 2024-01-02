package com.shree_samarth_library.BookStore.Repository;

import com.shree_samarth_library.BookStore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
