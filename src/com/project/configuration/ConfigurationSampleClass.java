package com.project.configuration;

import org.springframework.context.annotation.*;

import com.project.event.listner.AnnotationBasedEventListner;
import com.project.model.Student;

@Configuration
public class ConfigurationSampleClass {

	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public AnnotationBasedEventListner annotationBasedEventListner(){
		return new AnnotationBasedEventListner();
	}
}
