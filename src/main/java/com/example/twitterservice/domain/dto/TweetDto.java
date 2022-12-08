package com.example.twitterservice.domain.dto;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class TweetDto {
    private String url;
    private Long date;
    private String content;
    private String renderedContent;
    private String id;
    private String username;
    private String displayname;
    private String description;
    private String descriptionUrls;
    private String verified;
    private Long created;
    private Long followersCount;
    private Long friendsCount;
    private Long statusesCount;
    private Long favouritesCount;
    private Long listedCount;
    private Long mediaCount;
    private String location;
    private String isProtected;
    private String linkUrl;
    private String profileImageUrl;
    private String profileBannerUrl;
    private String outlinks;
    private String tcooutlinks;
    private Long replyCount;
    private Long likeCount;
    private Long quoteCount;
    private String conversationId;
    private String lang;
    private String source;
    private String media;
    private String retweetedTweet;
    private String quotedTweet;
    private String mentionedUsers;
}
