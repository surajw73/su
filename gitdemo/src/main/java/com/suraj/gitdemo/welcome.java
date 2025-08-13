package com.suraj.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
@GetMapping("/")
	public String add() {
	 return " Welcome to boot .... ";
}

}
