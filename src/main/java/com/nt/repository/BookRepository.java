package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
