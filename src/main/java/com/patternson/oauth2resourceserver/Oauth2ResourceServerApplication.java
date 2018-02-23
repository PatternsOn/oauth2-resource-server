package com.patternson.oauth2resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableResourceServer
@RestController
public class Oauth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ResourceServerApplication.class, args);
	}

	Map<Integer, Account> accountMap = new HashMap<>();


	@RequestMapping("/account")
	private Collection<Account> getAccountDetails() {

		if (ObjectUtils.isEmpty(accountMap)) {
			accountMap.put(123456, new Account(123456,
					"savings", "ramu", "bankname1"));
			accountMap.put(123457, new Account(123457,
					"savings", "sita", "bankname2"));
			accountMap.put(123458, new Account(123458,
					"current", "ganesh", "bankname3"));
		}
		return accountMap.values();
	}
}
