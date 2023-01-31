package com.example.HelloThymeleaf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.HelloThymeleaf.domain.Student;

@Controller
public class StudentController {

@RequestMapping(value = "/students", method = RequestMethod.GET)
public String greetingFormStudents(Model model) {
	ArrayList<Student> students = new ArrayList<>();
	students.add(new Student("Kate", "Cole"));
	students.add(new Student("Dan", "Brown"));
	students.add(new Student("Mike", "Mars"));
	model.addAttribute("studentsit", students);
	return "students";
}}