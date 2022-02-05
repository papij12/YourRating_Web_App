package com.Task4.Task4.Controller;

import com.Task4.Task4.Entity.User;
import com.Task4.Task4.Service.UserNotFoundExcption;
import com.Task4.Task4.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;




@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle","Add New user");
        return "user_form";
    }

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers = userService.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    @PostMapping("/users/save")
    public String saveUser(User user, RedirectAttributes ok) {
        ok.addFlashAttribute("message", "User has been saved successfully.");
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ok) {
        try {
            User user = userService.get(id);
            model.addAttribute("user", user);
            model.addAttribute("pageTitle","Edit User(ID:" + id +")");
            return "user_form";

        } catch (UserNotFoundExcption e) {
            ok.addFlashAttribute("message", e.getMessage());
            return "redirect:/users";
        }

    }
    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ok) {
        try {
            userService.delete(id);
            ok.addFlashAttribute("message","User with Id:"+id+ "was successfully deleted");
        } catch (UserNotFoundExcption e) {
            ok.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/users";
    }
}
