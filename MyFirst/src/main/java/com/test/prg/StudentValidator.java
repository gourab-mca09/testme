package com.test.prg;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return StudentForm.class.equals(arg0);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		StudentForm studentForm = (StudentForm) target;
		/*for (int i = 0;studentForm != null &&  i < studentForm.getStudents().size(); i++) {
            Student objStudent = studentForm.getStudents().get(i);

            if(objStudent != null) {
                //errors.rejectValue(, "your_error_code");
                ValidationUtils.rejectIfEmpty(errors, "students[" + i + "].age", "field.required", "STUDENT NO " + (i+1) + " AGE IS REQUIRED" );
                ValidationUtils.rejectIfEmpty(errors, "students[" + i + "].name", "field.required", "STUDENT NAME IS REQUIRED");
                ValidationUtils.rejectIfEmpty(errors, "students[" + i + "].id", "field.required", "STUDENT ID IS REQUIRED");
                ValidationUtils.rejectIfEmpty(errors, "students[" + i + "].dob", "field.required", "DOB ID IS REQUIRED");
                
                if(objStudent.getAge() != null && (objStudent.getAge() < 0 || objStudent.getAge() >100 )){
                	errors.rejectValue("students[" + i + "].age", "field.required", "STUDENT AGE IS 0 - 100 " );
                	//errors.addAllErrors(errors);
                }
                
            }

           
        }
		*/
	}
		

}
