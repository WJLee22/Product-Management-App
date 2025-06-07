package kr.ac.hansung.cse.productmanagementapp.controller;

import kr.ac.hansung.cse.productmanagementapp.entity.MyUser;
import kr.ac.hansung.cse.productmanagementapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<MyUser> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin/user_list";
    }
}
