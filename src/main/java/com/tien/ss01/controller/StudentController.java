package com.tien.ss01.controller;

import com.tien.ss01.repo.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/std")
public class StudentController {

    @GetMapping
    public String student(Model model) {
        model.addAttribute("listStudent", StudentRepository.getStudentList());
        return "student_list";
    }
}
