package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
