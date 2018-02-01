package ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.entity.Student;

@Controller
@RequestMapping(value = "json")
public class JsonController {
	@RequestMapping(value = "findAll")
	@ResponseBody
	public List<Student> findAll() {
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Student student = new Student("zhang" + i, 22, "ÄÐ");
			list.add(student);
		}
		return list;
	}
}
