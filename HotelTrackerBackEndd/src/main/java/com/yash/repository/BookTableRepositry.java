package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.BookTable;
@Repository
public interface BookTableRepositry extends JpaRepository<BookTable, String>{

	BookTable save(BookTable booktable);

}
