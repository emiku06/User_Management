package com.example.SpringAPI.Repository;

import com.example.SpringAPI.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
