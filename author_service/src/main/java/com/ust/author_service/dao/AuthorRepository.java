package com.ust.author_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.author_service.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}