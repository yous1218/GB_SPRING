package com.koreait.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.koreait.sample.SampleTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //테스트 코드가 스프링을 실행
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록
@Log4j
public class JDBCTests {

   static {
      try {
         Class.forName("oracle.jdbc.driver.oracleDriver");
      }catch (Exception e) {

      }
   }
   @Test
   public void testConnection() {
      //try(statement) : 소괄호 안에 close를 필요로하는 인스턴
   try(Connection conn=
            DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                                    "hr",
                                    "hr")){
      log.info(conn);
   }catch (Exception e) {

   }
   
   }
}