package com.bookmanager.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ruslan on 28.03.17.
 */
@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private int price;
}
