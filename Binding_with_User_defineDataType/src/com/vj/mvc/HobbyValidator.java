package com.vj.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	@Override
	public void initialize(IsValidHobby arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext cvc) {
	if(hobby==null)
	{
		return false;
	}
	else if(hobby.matches("football|hollyball|cricket|music"))
	{
		return true;
	} else
	{
		return false;
	}
	}



}
