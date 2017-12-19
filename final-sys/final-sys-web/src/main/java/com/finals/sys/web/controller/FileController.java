package com.finals.sys.web.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.finals.common.util.BaseResult;

@Controller
public class FileController {
    
	@RequestMapping("/submits")
	@ResponseBody
    public BaseResult<?> submit(@RequestParam(value = "filess", required = false) MultipartFile file, HttpServletRequest request) {
		
		try {
			System.err.println(request.getSession().getServletContext().getRealPath("save"));
			FileUtils.copyInputStreamToFile(file.getInputStream(),new File(request.getSession().getServletContext().getRealPath("save")+"\\"+file.getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.err.println("final ------------------------");
        return BaseResult.success();
        
    }
	
}