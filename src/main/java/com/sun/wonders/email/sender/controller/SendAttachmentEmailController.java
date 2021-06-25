package com.sun.wonders.email.sender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class SendAttachmentEmailController {

    @GetMapping(path = "/echo")
    public String getEcho() {
        return "Echo 1.. 2.. 3..";
    }
}
