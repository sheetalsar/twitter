//package com.sheetal.controller;
//
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.servlet.ServletContextHandler;
//import org.eclipse.jetty.servlet.ServletHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import java.net.InetAddress;
//
//public class ServerStart {
//
//    //private static final Logger logger = LoggerFactory.getLogger(ServerStart.class);
//
//    public static void main(String[] args) throws Exception {
//        System.setProperty("HOSTNAME", InetAddress.getLocalHost().getCanonicalHostName());
//        Server server = new Server(7070);
//        ServletHolder servletHolder = new ServletHolder(DispatcherServlet.class);
//        //servletHolder.setInitParameter("contextConfigLocation", "classpath:context.xml");
//        servletHolder.setInitOrder(1);
//
//        ServletContextHandler servletContextHandler = new ServletContextHandler(server,"/appearin");
//        servletContextHandler.addServlet(servletHolder, "/*");
//
//        server.setHandler(servletContextHandler);
//        server.start();
//        //logger.info("Server Started");
//    }
//}
