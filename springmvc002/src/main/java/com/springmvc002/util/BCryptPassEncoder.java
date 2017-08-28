package com.springmvc002.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPassEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("Passw0rd"));
	}

}
