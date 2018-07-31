package com.vj.mvc;



import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class StudentController{
@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[] {"hobby"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(dateFormat, false) );
		binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
	
	}


/*@ExceptionHandler(value=IOException.class)
public String handleIOException(Exception e)
{
	
	System.out.println("IO Exception Occured :"+e);
	return "IOException";
	
}*/

/*@ExceptionHandler(value=NullPointerException.class)
public String handleNullPointerException(Exception e)
{
	
	System.out.println("Null Pointer Exception Occured :"+e);
	return "NullPointerException";
	
}*/

@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
public String handleArrayIndexOutOfBoundsException()
{
	return "ArrayIndexOutOfBoundsException";
	
}



	@RequestMapping(value="/admissionForm.html"  ,method=RequestMethod.GET)
	public ModelAndView admissionStud() throws IOException{
		
		//String exceptionOccured="NULL_POINTER";
		/*String exceptionoccured="IO_Exception";
		if(exceptionoccured.equals("NULL_POINTER"))
		{
			throw new NullPointerException("Null Pointer Exception");
		}
		else if(exceptionoccured.equalsIgnoreCase("IO_Exception"))
		{
			throw new IOException("IO Exception_Occured");
		}
		*/
		
		/*String arr="Array Bound";
		if(arr.equals("Array Bound"))
		{
			throw new ArrayIndexOutOfBoundsException("Exception occuerd");
		}*/
     ModelAndView mav=new ModelAndView("admission");
		return mav;
	}
	
	
	
	@ModelAttribute
	public void addingCommonObject(Model model1)
	{
		 model1.addAttribute("headermessage","JIT Collage of Engineering Nashik");
	}
	
	
	@RequestMapping(value="/Admission.html" ,method=RequestMethod.POST)
	public ModelAndView admissionformfill(@ModelAttribute("st") @Valid Student student,BindingResult result){	
		if(result.hasErrors())
		{
			ModelAndView mav=new ModelAndView("admission");

			return mav;
			
		}
ModelAndView mav=new ModelAndView("admissionsuccess");

		return mav;
	}
	
	/*
	@ExceptionHandler(value=IOException.class)
	public String IOException(Exception e)
	{
		System.out.println("IO exception occured here "+e);
		return "IOException";
	}
	@RequestMapping(value="/hii")
	public ModelAndView hii()
	{
		String ioException="IO Exception";
		if(ioException.equals(""))
		{
			throw new IOException("occured Exception");
		}
		return new ModelAndView("hello");
	}
	*/

	
	}

