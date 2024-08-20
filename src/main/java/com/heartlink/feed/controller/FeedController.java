package com.heartlink.feed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feed")
public class FeedController {

    @GetMapping("")
    public String moveMain() {
        return "feed/feed_main";  // "index"는 src/main/resources/templates/admin-main.html
    }

    @GetMapping("/write")
    public String moveNewFeed(){
        return "feed/feed_write";
    }
}
