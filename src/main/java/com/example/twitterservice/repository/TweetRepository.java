package com.example.twitterservice.repository;

import com.example.twitterservice.domain.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, String> {
}
