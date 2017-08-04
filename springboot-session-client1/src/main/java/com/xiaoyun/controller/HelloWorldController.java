package com.xiaoyun.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @RequestMapping("/setsession/{key}/{value}")
    @ResponseBody
    public String setsession(HttpServletRequest req, HttpServletResponse resp,@PathVariable String key,@PathVariable String value){
    	req.getSession().setAttribute(key, value);
        String sessionValue = (String) req.getSession().getAttribute(key);
        return sessionValue;
    }
    
    
    @RequestMapping("/getsession/{key}")
    @ResponseBody
    public String getsession(HttpServletRequest req, HttpServletResponse resp,@PathVariable String key){
        String value = (String) req.getSession().getAttribute(key);
        if(value==null){
        	return "没有值";
        }
        return value;
    }
}