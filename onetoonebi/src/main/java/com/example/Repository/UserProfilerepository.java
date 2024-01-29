package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.UserProfile;

public interface UserProfilerepository extends JpaRepository<UserProfile, Integer> {

}
