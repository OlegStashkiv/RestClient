package com.olegstashkiv.spring.rest;

import com.olegstashkiv.spring.rest.configuration.MyConfiguration;
import com.olegstashkiv.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
//        Employee empById = communication.getEmployee(2);
//        System.out.println(empById);

//        Employee employee1 = new Employee("Yura", "Yurechko", "Sport", 1200);
//        employee1.setId(10);
//        communication.saveEmployee(employee1);

        communication.deleteEmployee(10);


    }
}
