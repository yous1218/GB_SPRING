package com.koreait.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j;

@ControllerAdvice	//해당 객체가 스프링의 컨트롤러에서 발생하는 예외를 처리하는 존재임을 명시
@Log4j
public class CommonExceptionAdvice {
	
	@ExceptionHandler(Exception.class)
	public String except(Exception e,Model model) {
		//예외가 발생하게 되면 해당 예외 필드가 메모리에 할당된다.
		//할당 된 예외필드의 주소값을 받을 객체가 필요하므로 매개변수에 Exception타입의
		//e 객체를 선언해 놓는다.
		log.error("Exception..."+e.getMessage());
		model.addAttribute("exception",e);
		log.error(model);
		return "error_page";
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404() {
		return "error404_page";
	}
}
