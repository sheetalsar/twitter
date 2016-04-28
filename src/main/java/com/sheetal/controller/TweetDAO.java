package com.sheetal.controller;

import java.util.List;

public interface TweetDAO {
    public Tweet getById(int id);
    
    public List<Tweet> getAll();
}


