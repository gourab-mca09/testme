package com.test1.prg1;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.prg.Student;
import com.test.prg.StudentForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController2.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/student2", method = RequestMethod.GET)
	public String student(@ModelAttribute("SpringWeb")StudentForm studentFrom) {
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
	
	@RequestMapping(value = "/addStudent2")
	public String home(@ModelAttribute("SpringWeb")StudentForm studentFrom) {
		logger.info("Welcome home! The client locale is {}.");                       
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		List<Student> students = studentFrom.getStudents();
		String formattedDate = dateFormat.format(date) + "gourab";
		
		
		
		//Model model = new Model("");
		//model.addAttribute("serverTime", formattedDate );
		
		//model.addAttribute("name", student.getName());
		//model.addAttribute("age", student.getAge());
		//model.addAttribute("id", student.getId());
		
		return "result";
	}
	
}

