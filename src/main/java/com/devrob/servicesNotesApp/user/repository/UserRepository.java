package com.devrob.servicesNotesApp.user.repository;

import com.devrob.servicesNotesApp.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
