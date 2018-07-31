package com.vj.mvc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint(validatedBy = {HobbyValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String message() default "please provide the  valid Hobby ;"+"Acceptef Hobby Are:  football , hollyball ,cricke , music (choosen anyone) ";

Class<?>[] group() default  {};

Class<? extends Payload>[] payload() default {};

}
