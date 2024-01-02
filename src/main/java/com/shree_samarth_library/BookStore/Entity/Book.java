package com.shree_samarth_library.BookStore.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "td_book_details")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "isbn_number")
    private String isbnId;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_publisher")
    private String bookPublisher;

    @Column(name = "book_price")
    private Integer bookPrice;

}
