package com.tnsif.springAnnotations.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		return new MusicTeacher();
	}
	
}