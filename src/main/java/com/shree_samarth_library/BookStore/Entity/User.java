package com.shree_samarth_library.BookStore.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "td_user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
