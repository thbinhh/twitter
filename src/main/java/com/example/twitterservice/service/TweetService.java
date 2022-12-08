package com.example.twitterservice.service;

import com.example.twitterservice.domain.Tweet;
import com.example.twitterservice.repository.TweetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class TweetService {

    private TweetRepository tweetRepository;

    @Autowired
    public TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Transactional
    public void persistedCoinPrice(Tweet tweet){
        tweetRepository.save(tweet);
        log.info("Coin price persisted {}", tweet);
    }
}
