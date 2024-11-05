package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MyBookList;
import com.nt.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository mybook;
	public void saveMyBooks(MyBookList book)
	{
		mybook.save(book);
	}
	public List<MyBookList> getAllBooks()
	{
		return mybook.findAll();
	}
	public void deleteById(int id)
	{
		mybook.deleteById(id);
	}

}
