/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@SpringBootApplication
@EnableEurekaServer
public class LearningSpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(
			LearningSpringBootEurekaServerApplication.class);
	}

	@Bean
	UserDetailsService userDetailsService() {
		return new InMemoryUserDetailsManager(
			User.withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER").build());
	}
}
// end::code[]