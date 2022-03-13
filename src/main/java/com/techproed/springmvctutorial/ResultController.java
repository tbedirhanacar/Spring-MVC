package com.techproed.springmvctutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {

//	//1.Way:
//	@RequestMapping("add") //the parameter should be the same as the action in the form
//	public String addNums1(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("n1")); //This method return a string so we are converting
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a + b;
//		
//		int product = a*b;
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result.jsp";
//	}
	
	//2.Way:
//	@RequestMapping("add")
//	public String addNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
//		int sum = a+b;
//		int product = a*b;
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		return "result.jsp";
//	}
	
	//3.Way:
	//1st way to use ModelAndView()
//	@RequestMapping("add")
//	public ModelAndView addNums3(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		int sum = a+b;
//		int product = a*b;
//		mv.addObject("sumOfTwoIntegers", sum);
//		mv.addObject("productOfTwoIntegers", product);
//		return mv;
//	}
	
//	//4.Way:
//	//2nd way to use ModelAndView() (recommended)
//	@RequestMapping("add")
//	public ModelAndView addNums4(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//		ModelAndView mv = new ModelAndView("result.jsp");
//		int sum = a+b;
//		int product = a*b;
//		mv.addObject("sumOfTwoIntegers", sum);
//		mv.addObject("productOfTwoIntegers", product);
//		return mv;
//	}
	
//	//5.Way:
//		//showing the usage of Model Interface
//	@RequestMapping("add")
//	public String addNums5(@RequestParam("n1") int a, @RequestParam("n2") int b, Model m) {
//		int sum = a+b;
//		int product = a*b;
////		First usage of model interface
////		m.addAttribute("sumOfTwoIntegers", sum);
////		m.addAttribute("productOfTwoIntegers", product);
//		
////		Second usage (chaining)
//		m.addAttribute("sumOfTwoIntegers", sum).addAttribute("productOfTwoIntegers", product);
//		return "result.jsp";
//	}

	//6.Way:
		//Model Mapping
	@RequestMapping("add")
	public String addNums6(@RequestParam("n1") int a, @RequestParam("n2") int b, ModelMap mm) {
		int sum = a+b;
		int product = a*b;

		mm.addAttribute("sumOfTwoIntegers", sum);
		mm.addAttribute("productOfTwoIntegers", product);
		return "result";
	}
//**************************************************************
	
	//Student Method:
	
	//1.Way:
//	@RequestMapping("addStudent")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m) {
//		//First object creation way:
////		Student student = new Student();
////		student.setId(id);	
////		student.setName(name);
//		
//		//this was using a constructor without parameters
//		
//		//Second Object Creation Way:
//		Student student = new Student(id, name);
//		
//		m.addAttribute("studentObject", student);	
//		
//		return "result.jsp";
//		
//	}
	
	//2.Way
//	@RequestMapping("addStudent")
//	public String addStudent2(@ModelAttribute Student student, Model m) {	
//		
//		m.addAttribute("studentObject", student);
//		
//		return "result.jsp";
//	
//	}
	
//	//3.Way
//	@RequestMapping("addStudent")
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	//How to get a spesific field from the object, you need to use ModelAttribute
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//How to use POST method
	//1.Way
	/* to use post method:
	 	1)inside the annotation paranthesis type method=RequestMethod.POST
	 	2)then go to index.jsp file and add method="post" inside the form tag
	 
	 */

//	@RequestMapping(value = "addStudent", method=RequestMethod.POST)
//	public String addStudent4(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	//How to get a spesific field from the object, you need to use ModelAttribute
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//2.Way:
		/*
		 	To use post method
		 		1)Use @PostMapping("addStudent") with action name from the form tag
		 		2)Then go to index.jsp and add method="post" inside the form tag
		 		
		 */
	
//	@PostMapping("addStudent")
//	public String addStudent5(@ModelAttribute("studentObject") Student student) {
//		return "result";
//	}
//	
//	//How to get a spesific field from the object, you need to use ModelAttribute
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent", student.getName());
//	}
	
	//How to use GET Method
	
	//1.Way
		/*
		 	1)Inside the method paranthesis type "method=RequestMethod.GET"
		 	2)Go to index.jsp and add method="get" inside the form tag
		 	3)Go to result.jsp file and type ==> ${studentList}
		 */
	
//	@RequestMapping(value="getStudent", method=RequestMethod.GET)
//	public String getStudent(Model m) {
//		
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Can"));
//		students.add(new Student(103,"Mary Can"));
//		students.add(new Student(104,"Tom Hanks"));
//		students.add(new Student(105,"Angie Ocean"));
//		
//		m.addAttribute("studentList", students);
//		
//		return "result";
//		
//	}
	
	//2.Way
//	@GetMapping("getStudent")
//	public String getStudent(Model m) {
//		
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Can"));
//		students.add(new Student(103,"Mary Can"));
//		students.add(new Student(104,"Tom Hanks"));
//		students.add(new Student(105,"Angie Ocean"));
//		
//		m.addAttribute("studentList", students);
//		
//		return "result";
//		
//	}
	
	//How to get a spesific student	
	@GetMapping("getStudentWithId")
	public String getStudent(@RequestParam("id") int id, Model m) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101,"Ali Can"));
		students.add(new Student(102,"Veli Can"));
		students.add(new Student(103,"Mary Can"));
		students.add(new Student(104,"Tom Hanks"));
		students.add(new Student(105,"Angie Ocean"));
		
		int idx = -1;//-1 is false index
		for (Student w : students) {
			if(id==w.getId()){
				idx=students.indexOf(w);
				break;
			}
		}
		
		if (idx==-1) {
			m.addAttribute("spesificStudent", "There is no such ID");
		}else {
			m.addAttribute("spesificStudent", students.get(idx));
		}
		
		return "result";
		
	}
	

	
	
	
}
