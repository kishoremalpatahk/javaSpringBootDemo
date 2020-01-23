package com.kishu.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishu.beans.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
