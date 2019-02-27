package com.market.controller;

import com.market.config.BusinessException;
import com.market.config.LogInfo;
import com.market.config.ServerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @Autowired
    private ServerInfo serverInfo;

    @Autowired
    private LogInfo logInfo;

    @Value("#{serverInfo.ip}")
    private String ip;

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${sex:woman}")
    private String sex;

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @PostMapping
    public BusinessException addExcp(@RequestBody BusinessException excp) {
        BusinessException exception = new BusinessException();
        System.out.println("getStudentName...");
        return exception;
    }

    @RequestMapping(value = "/login/{id}/{name}", method = RequestMethod.GET)
    public String login(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        validate(id, name);
        print();
        if (true) {
            logger.info("=======================info我的");
            logger.error("=======================error");
            logger.warn("=======================warn");
        }

        return "login: " + id + ", " + name + ", path: " + logInfo.getPath();
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
        return "logout: " + id;
    }

    private void validate(Integer id, String name) {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }

    private void print() {
        System.out.println("logInfo: " + logInfo);
        System.out.println("getProperty(log.path): " + System.getProperty("log.path"));
        System.out.println("getProperty(JAVA_HOME): " + System.getProperty("JAVA_HOME"));
        System.out.println("getProperty(interval): " + System.getProperty("interval"));
        System.out.println("getProperty(java.version): " + System.getProperty("java.version"));
        System.out.println("sex: " + sex);
    }

    private void insert(Integer id, String name) {
        System.out.println("id" + id);
        System.out.println("name" + name);
        System.out.println("Inserting a row.");
    }
}
