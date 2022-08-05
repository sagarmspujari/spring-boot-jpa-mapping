package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

/**
 * Created by rajeevkumarsingh on 20/11/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
