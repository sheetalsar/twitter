package com.sheetal.controller;
/**
 * Created by sheetalsarogi on 8/31/15.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
@Controller
public class TweetsController {

    @RequestMapping("/view")
    public @ResponseBody List<Tweet> getPerson(){
        //Get the Spring Context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/beanconfig.xml");
        //Get the EmployeeDAO Bean
        TweetDAO tweetDAO = ctx.getBean("TweetDAO", TweetDAO.class);
        List<Tweet> twList = tweetDAO.getAll();
        return twList;
    }
    @RequestMapping(value="/idinfo/{id}", method= RequestMethod.GET)
    public @ResponseBody Tweet getById(@PathVariable int id){
        //Get the Spring Context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/beanconfig.xml");
        //Get the EmployeeDAO Bean
        TweetDAO tweetDAO = ctx.getBean("TweetDAO", TweetDAO.class);
        Tweet tw = tweetDAO.getById(id);
        return tw;
    }
}
//@Controller
//public class TweetsController extends AbstractController{
//
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest request,
//                                                 HttpServletResponse response) throws Exception {
//        ModelAndView model = new ModelAndView("tweets");
//        model.addObject("msg", "my tweets");
//        return model;
//    }
//}