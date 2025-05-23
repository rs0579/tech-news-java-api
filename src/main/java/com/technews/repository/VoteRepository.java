package com.technews.repository;

import com.technews.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    //Instance-level annotation of the query we want to use
    @Query("SELECT count(*) FROM Vote v where v.postId = :id")
    int countVotesById(@Param("id") Integer id);
    //The above method-level annotation allows us to use the id as a parameter.
}
