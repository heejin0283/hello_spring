package GDGoC_study.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 클래스는 REST API를 위한 컨트롤러라는 뜻
public class SimpleController {

    @GetMapping("/hi") // 사용자가 http://localhost:8080/hi 로 접속하면 이 메서드가 실행됨
    public String sayHi() {
        return "Hi, this is a simple controller!"; // 브라우저에 그대로 이 문자열이 출력됨
    }
}