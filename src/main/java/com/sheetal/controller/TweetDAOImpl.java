package com.sheetal.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Created by sheetalsarogi on 9/2/15.
 */
public class TweetDAOImpl implements TweetDAO{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public Tweet getById(int id) {
        String query = "select person, TweetMessage from Tweet where id = ?";
        Tweet tw = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                tw = new Tweet();
                tw.setId(id);
                tw.setPerson(rs.getString("person"));
                tw.setTweetMessage(rs.getString("TweetMessage"));
                System.out.println("Tweet Found::"+tw);
            }else{
                System.out.println("No Tweet found with id="+id);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return tw;
    }

    @Override
    public List<Tweet> getAll() {
        String query = "select id, person, TweetMessage from Tweet";
        List<Tweet> tweetArrayList = new ArrayList<Tweet>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Tweet tw = new Tweet();
                tw.setId(rs.getInt("id"));
                tw.setPerson(rs.getString("person"));
                tw.setTweetMessage(rs.getString("TweetMessage"));
                tweetArrayList.add(tw);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return tweetArrayList;
    }
    }

