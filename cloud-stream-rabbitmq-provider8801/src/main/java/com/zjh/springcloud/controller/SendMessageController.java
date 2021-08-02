package com.zjh.springcloud.controller;

import com.zjh.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zheng jianghai
 * @create 2021-07-09 11:25
 */
@RestController
public class SendMessageController {

    @Autowired
    IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
