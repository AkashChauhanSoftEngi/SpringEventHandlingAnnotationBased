package com.project.event.listner;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class AnnotationBasedEventListner {
	@EventListener({ContextStartedEvent.class})
	public void doSomethingOne(){
		System.out.println("ContextStartedEvent is Received..!");
	}
	
	@EventListener({ContextRefreshedEvent.class})
	public void doSomethingTwo(){
		System.out.println("ContextRefreshedEvent is Received..!");
		System.out.println("-------------------------------------");
	}
	
	@EventListener({ContextStoppedEvent.class})
	public void doSomethingThree(){
		System.out.println("ContextStoppedEvent is Received..!");
	}
	
	@EventListener({ContextClosedEvent.class})
	public void doSomethingFour(){
		System.out.println("ContextClosedEvent is Received..!");
	}
	
	@EventListener({ContextRefreshedEvent.class, ContextStartedEvent.class})
	public void doSomethingFive(){
		System.out.println("Multiple Events has Received..!");
		System.out.println("-------------------------------------");
	}
}
