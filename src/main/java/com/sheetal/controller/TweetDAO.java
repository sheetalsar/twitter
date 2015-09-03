package com.sheetal.controller;
import java.util.List;

/**
 * Created by sheetalsarogi on 9/2/15.
 */
public interface TweetDAO {
    public Tweet getById(int id);
    public List<Tweet> getAll();
}


