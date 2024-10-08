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
    @GetMapping("/hello2") 
    public String hello2(Model model) {
        String message = "홍길동님. \n\n방갑습니다. \n\n오늘. \n\n날씨는. \n\n매우 좋습니다.";
        message = message.replace("\n","<br>");
        model.addAttribute("data", message);
        return "hello2";
    }
}




