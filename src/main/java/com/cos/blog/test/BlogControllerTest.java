package com.cos.blog.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //스프링이 com.cos.blog 이하를 스캔하여 모든 파일을 new하는 것을 
			//특정 어노테이션 붙어 있는 클래스 파일 new해서 loc 컨테이너에서 관리
public class BlogControllerTest {
		
	@RequestMapping("test/hello")
	public String hello()
	{
		return "<h1>hell osprng boot </h1>";
	}
}
