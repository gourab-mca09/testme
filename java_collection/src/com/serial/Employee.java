package com.serial;

import java.io.Serializable;    
public class Employee implements Serializable {
//private static final long serialVersionUID = 1L;
private String empname;
private byte empage;
private byte empid;

public String getEmpName() {
    return empname;
}
public void setEmpName(String empname) {
    this.empname = empname;
}
public byte getEmpAge() {
    return empage;
}
public void setEmpAge(byte empage) {
    this.empage = empage;
}

public String whoIsThis() {
    StringBuffer employee = new StringBuffer();
    employee.append(getEmpName()).append(" is" ).append(getEmpAge()).append(" years old  ");
    return employee.toString();
}
public byte getEmpid() {
	return empid;
}
public void setEmpid(byte empid) {
	this.empid = empid;
}
}
