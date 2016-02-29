package com.sheetal.controller;

/**
 * Created by sheetalsarogi on 8/31/15.
 */

public class Tweet {
    private int id;
    private String person;
    private String TweetMessage;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTweetMessage() {
        return TweetMessage;
    }

    public void setTweetMessage(String tweetMessage) {
        TweetMessage = tweetMessage;
    }
}