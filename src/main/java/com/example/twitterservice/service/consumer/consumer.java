package com.example.twitterservice.service.consumer;

import com.example.twitterservice.domain.Tweet;
import com.example.twitterservice.domain.dto.TweetDto;
import com.example.twitterservice.service.TweetService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
@Service
public class consumer {
    private static final String tweeetTopic = "${topic.name}";

    private ObjectMapper objectMapper;

    private ModelMapper modelMapper;

    private TweetService tweetService;

    @Autowired
    public consumer(ObjectMapper objectMapper, ModelMapper modelMapper, TweetService tweetService) {
        this.objectMapper = objectMapper;
        this.modelMapper = modelMapper;
        this.tweetService = tweetService;
    }

    @KafkaListener(topics = tweeetTopic, groupId = "default")
    public void consumeMessage(String message) throws JsonProcessingException {
        log.info("Message consumed {}", message);
        TweetDto tweetDto = objectMapper.readValue(message, TweetDto.class);
        Tweet tweet = modelMapper.map(tweetDto, Tweet.class);
        tweetService.persistedCoinPrice(tweet);
    }
}
