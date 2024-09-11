package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 컨트롤러 이노테이션 명시
public class DemoController {
    @GetMapping("/hello") // 전송방식 GET
    public String hello(Model model) {
        model.addAttribute("data", "방갑습니다."); // model 설정
        return "hello"; // hello.html연결
    }
}
