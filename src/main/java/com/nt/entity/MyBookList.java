package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="MyBooks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyBookList {
	@Id
	private int id;
	private String name;
	private String author;
	private Double price;

}
