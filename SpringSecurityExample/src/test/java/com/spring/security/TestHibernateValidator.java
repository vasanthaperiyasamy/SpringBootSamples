package com.spring.security;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import com.hibernate.validator.Car;

public class TestHibernateValidator {
		
	private static Validator validator;
	
	@BeforeClass
	public static void setup() {
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		validator=factory.getValidator();
	}
	
	
	
	@Test
	public void  testHibernateValidator() {
		Car car=new Car(null,"123sd5",4);
		Set<ConstraintViolation<Car>> constraintViolation=validator.validate(car);
		assertEquals(1, constraintViolation.size());
		assertEquals("muy not be null", constraintViolation.iterator().next().getMessage());
		
	}

}
