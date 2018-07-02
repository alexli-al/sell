package com.mtx.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String doUpload(){
        return "/upload";
    }
}
