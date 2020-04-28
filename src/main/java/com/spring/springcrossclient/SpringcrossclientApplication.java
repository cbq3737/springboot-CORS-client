package com.spring.springcrossclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcrossclientApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(SpringcrossclientApplication.class,args);
    }//현재 서버는 8080포트로 실행중이고, 클라이언트 애플리케이션은 18080으로 포트를 변경해준다.
    //index페이지 생성-> ajax콜로 서버쪽에서 만든 rest api를 호출->index.html작성->alert가 fail뜨는데 이를 해결해주기위해 서버 프로젝트에 @CrossOrigin어노테이션을 붙혀줌.->클라이언트 실행결과 불러올수있음
}
