package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
@SecondaryTable(name="EmpAddress")
public class empBean {
@Id
@GeneratedValue
int eid;
String name;
Double salary;
@Column(table="EmpAddress")
String city;
@Column(table="EmpAddress")
String state;
@Column(table="EmpAddress")
String Country;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}

}
