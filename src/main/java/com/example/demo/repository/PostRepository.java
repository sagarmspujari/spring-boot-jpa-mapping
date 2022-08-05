package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post;

/**
 * Created by rajeevkumarsingh on 22/11/17.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
