package com.test.prg;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalException 
{
	@ExceptionHandler(Exception.class)
	public ModelAndView  processIOException(IOException ioe)
	{
		ModelAndView mav = new ModelAndView("errors");
		 mav.addObject("name", ioe.getClass().getSimpleName());
	     mav.addObject("message", ioe.getMessage());
	 
	     return mav;
	}
	@ExceptionHandler(UserDefinedException.class)
	public ModelAndView  processCustomException( UserDefinedException ex)
	{
		ModelAndView model = new ModelAndView("errors");
		model.addObject("errCode", ex.getName());
		model.addObject("errMsg", ex.getMessage());
	     
	 
	     return model;
	}	
}
