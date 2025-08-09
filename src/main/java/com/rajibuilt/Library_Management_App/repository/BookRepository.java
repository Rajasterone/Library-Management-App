package com.rajibuilt.Library_Management_App.repository;

import com.rajibuilt.Library_Management_App.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
