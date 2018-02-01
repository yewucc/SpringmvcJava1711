package ssm.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ssm.entity.Student;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	// format.setLenient(false);
	// binder.registerCustomEditor(Date.class, new CustomDateEditor(format,
	// true));
	// }

	@RequestMapping(value = "/toAddPage")
	public ModelAndView toAddPage() {
		System.out.println("StudentController.toAddPage()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("student_add");
		return modelAndView;
	}

	@RequestMapping(value = "/add")
	public ModelAndView add(Student student) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(student);
		modelAndView.setViewName("student_info");
		return modelAndView;
	}

	@RequestMapping(value = "/add2")
	public String add2(Student student, Model model) {
		model.addAttribute("student", student);
		return "student_info";
	}

	@RequestMapping(value = "/add3", method = RequestMethod.POST)
	public String add3(String name, int age, Date date, Model model) {
		System.out.println(date);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "student_info";
	}

	@RequestMapping(value = "/add4")
	public void add4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.getRequestDispatcher("/WEB-INF/jsp/student_info.jsp").forward(request, response);
	}
}
