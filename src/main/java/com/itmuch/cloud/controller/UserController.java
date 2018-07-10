package com.itmuch.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/hello/{userName}")
	public String sayHello(@PathVariable String userName) {
		if(userName==null || "".equals(userName)){
			return "用户名称怎么能为空呢";

//        1111
		}
		return userName+"，你好！";
	}
}
