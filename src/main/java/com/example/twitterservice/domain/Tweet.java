package com.example.twitterservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWEET")
public class Tweet {
    private String url;
    private Long date;
    private String content;
    private String renderedContent;
    @Id
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
