package kr.ac.hansung.cse.productmanagementapp.controller;

import kr.ac.hansung.cse.productmanagementapp.entity.MyUser;
import kr.ac.hansung.cse.productmanagementapp.entity.Product;
import kr.ac.hansung.cse.productmanagementapp.repository.UserRepository;
import kr.ac.hansung.cse.productmanagementapp.service.ProductService;
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

    @Autowired
    private ProductService productService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        // 사용자 통계
        List<MyUser> users = userRepository.findAll();
        model.addAttribute("userCount", users.size());
        model.addAttribute("users", users);

        // 상품 통계
        List<Product> products = productService.listAll();
        model.addAttribute("productCount", products.size());
        model.addAttribute("products", products.subList(0, Math.min(5, products.size()))); // 최근 5개 상품만 표시

        return "admin/dashboard";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<MyUser> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin/user_list";
    }
}
