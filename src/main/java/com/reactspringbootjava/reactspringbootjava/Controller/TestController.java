package com.reactspringbootjava.reactspringbootjava.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/api")
public class TestController {
    @GetMapping("/home")
    public String getHome(){
        return "Hello home!!";

    }

//    @PostMapping("/ip")
//    public ResponseEntity<String> ip (HttpServletRequest request) {
//        // 요청을 보낸 클라이언트의 IP주소를 반환합니다.
//        return ResponseEntity.ok(request.getRemoteAddr());
//    }
}
