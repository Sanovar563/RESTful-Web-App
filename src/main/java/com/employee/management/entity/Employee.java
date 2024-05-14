package com.employee.management.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int employee_id;
	    private String first_name;
	    private String last_name;
	    private String email;
	    private String title;
	    
	    
	    
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + first_name + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }

//		public Employee(int employee_id, String first_name, String last_name, String email, String title) {
//		
//			this.employee_id = employee_id;
//			this.first_name = first_name;
//			this.last_name = last_name;
//			this.email = email;
//			this.title = title;
//		}
//
//		public Employee() {
//			
//		}
//
//		/**
//		 * @return the employee_id
//		 */
//		public int getEmployee_id() {
//			return employee_id;
//		}
//
//		/**
//		 * @param employee_id the employee_id to set
//		 */
//		public void setEmployee_id(int employee_id) {
//			this.employee_id = employee_id;
//		}
//
//		/**
//		 * @return the first_name
//		 */
//		public String getFirst_name() {
//			return first_name;
//		}
//
//		/**
//		 * @param first_name the first_name to set
//		 */
//		public void setFirst_name(String first_name) {
//			this.first_name = first_name;
//		}
//
//		/**
//		 * @return the last_name
//		 */
//		public String getLast_name() {
//			return last_name;
//		}
//
//		/**
//		 * @param last_name the last_name to set
//		 */
//		public void setLast_name(String last_name) {
//			this.last_name = last_name;
//		}
//
//		/**
//		 * @return the email
//		 */
//		public String getEmail() {
//			return email;
//		}
//
//		/**
//		 * @param email the email to set
//		 */
//		public void setEmail(String email) {
//			this.email = email;
//		}
//
//		/**
//		 * @return the title
//		 */
//		public String getTitle() {
//			return title;
//		}
//
//		/**
//		 * @param title the title to set
//		 */
//		public void setTitle(String title) {
//			this.title = title;
//		}

		
		
	    
	    
}
