package com.story.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file,@RequestParam(value = "desc",required = false) String desc) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("E:\\javase_study\\spring_mvc_study\\src\\main\\resources\\"+file.getOriginalFilename()));
        return "success";
    }

    @RequestMapping("/uploads")
    public String uploads(@RequestParam("file") MultipartFile[] file,@RequestParam(value = "desc",required = false) String desc) throws IOException {
        for (MultipartFile multipartFile : file) {
            if (!multipartFile.isEmpty()){
                multipartFile.transferTo(new File("E:\\javase_study\\spring_mvc_study\\src\\main\\resources\\"+multipartFile.getOriginalFilename()));
            }
        }
        return "success";
    }
}
