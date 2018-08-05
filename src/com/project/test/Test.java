package com.project.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.configuration.ConfigurationSampleClass;
import com.project.model.Student;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationSampleClass.class);
		Student student = ctx.getBean(Student.class);
		student.setFirstName("XXX");
		student.setLastName("YYY");

		ctx.start();

		System.out.println("-------------------------");
		System.out.println(student.toString());
		System.out.println("----------------------------------");
		ctx.stop();
		System.out.println("----------------------------------");
		ctx.close();
		System.out.println("----------------------------------");
	}

}
