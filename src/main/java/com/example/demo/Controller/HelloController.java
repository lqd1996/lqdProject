package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// 测试接口
	@RequestMapping(value = "hello")
	@ResponseBody
	public String getHello() {
		String arg = new String();
		String string = new String();
		Map<String, Object> map2 = new HashMap<String, Object>();
		String arg2 = new String();
		String string2 = new String();
		return "Hello";

	}
}
