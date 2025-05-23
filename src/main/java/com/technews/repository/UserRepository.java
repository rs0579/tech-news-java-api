package com.technews.repository;

import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //To ensure that the repository can take User and the id of that user, we specify an Integer.
    User findUserByEmail(String email) throws Exception;
    //You have to place the name of the table it's extending before the method name
}
