package com.test.prg;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	@Qualifier("studentValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, null, new CustomDateEditor(dateFormat, true, 10) );
		binder.setValidator(validator);		
	}
	
	@RequestMapping(value = {"/","/home" }, method = RequestMethod.GET)
	public String main() {
		return "home"; //new ModelAndView("student", "SpringWeb", studentFrom);
	}

	/*
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/{test}" })
	public String student(@PathVariable("test") String testm, @RequestParam Map<String, String> params, @ModelAttribute("SpringWeb")StudentForm studentFrom ) {
			System.out.println("testm>>" + testm);
			List<Student> students = new ArrayList<Student>();
				students.add(new Student());
				students.add(new Student());
			studentFrom.setStudents(students);
		
		return "student"; //new ModelAndView("student", "SpringWeb", studentFrom);
	}
	
	/*@ModelAttribute("student")
	public Student createStudentModel() {	
		return new Student();
	}*/
	
	@RequestMapping(value = "/addStudent")
	public String home(@Valid @ModelAttribute("SpringWeb") StudentForm studentFrom, BindingResult objBindingResult) throws UserDefinedException, Exception{
		logger.info("Welcome home! The client locale is {}.");                       
		
		if(objBindingResult.hasErrors()){
			return "student";
			//throw new UserDefinedException("Exception", "UserDefine Exception");
		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		List<Student> students = studentFrom.getStudents();
		String formattedDate = dateFormat.format(date) + "gourab";
		
		try{ 
			Thread.sleep(5000);
		}catch(Exception e){}
		
		//Model model = new Model("");
		//model.addAttribute("serverTime", formattedDate );
		
		//model.addAttribute("name", student.getName());
		//model.addAttribute("age", student.getAge());
		//model.addAttribute("id", student.getId());
		
		return "result";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView  processIOException(IOException ioe)
	{
		ModelAndView mav = new ModelAndView("error/errors");
		 mav.addObject("name", ioe.getClass().getSimpleName());
	     mav.addObject("message", ioe.getMessage());
	 
	     return mav;
	}
	@ExceptionHandler(UserDefinedException.class)
	public ModelAndView  processCustomException( UserDefinedException ex)
	{
		ModelAndView model = new ModelAndView("error/errors");
		model.addObject("errCode", ex.getName());
		model.addObject("errMsg", ex.getMessage());
	     
	 
	    return model;
	}	
}
