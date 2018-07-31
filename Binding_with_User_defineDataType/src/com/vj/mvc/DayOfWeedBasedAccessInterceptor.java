package com.vj.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeedBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {

	
	Calendar cal=Calendar.getInstance();
	
	int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
	//System.out.println(dayOfWeek);
	if(dayOfWeek==5)//1 mean sunday , 2 mean monday...7 mean saturday
	{
		response.getWriter().write("This site close on Saturday Please Try access it"+"any other week day !!!!");
	 return false;	
	}
	
	return true;
}

@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	System.out.println("HandlerInterceptorAdapter : Spring MVC call the postHander() method for "+
			request.getRequestURL().toString());		
	}


@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	
	System.out.println("HandletInterceptoAdapter : Spring MVC is call the afterHander() method  for "+
	                                      request.getRequestURL().toString());
	
		
	}
}
