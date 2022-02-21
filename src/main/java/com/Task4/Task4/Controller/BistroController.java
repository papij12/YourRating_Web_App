package com.Task4.Task4.Controller;

import com.Task4.Task4.Entity.Bistro;
import com.Task4.Task4.Entity.User;
import com.Task4.Task4.Service.BistroNotFoundExpection;
import com.Task4.Task4.Service.BistroService;
import com.Task4.Task4.Service.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BistroController {
    // new codes
    @Autowired
    private BistroService bistroService;

    @GetMapping("/bistros")
    public String showAllBistros(Model model){
        List<Bistro> listBistros = bistroService.listAll();
        model.addAttribute("listBistros", listBistros);
        return "bistros";


    }
    @GetMapping("/bistros/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ok) {
        try{
            Bistro bistro = bistroService.get(id);
            model.addAttribute("bistro", bistro);
            model.addAttribute("pageTitle","Rate Bistro(ID:" + id +")");
            return "bistro_form";

        } catch (BistroNotFoundExpection e) {
            ok.addFlashAttribute("message", e.getMessage());
            return "redirect:/bistros";
        }

    }
    @PostMapping("/bistros/save")
    public String saveBistro(Bistro bistro, RedirectAttributes ok) {
        ok.addFlashAttribute("message", "Thank you for rating us.");
       bistroService.save(bistro);
        return "redirect:/bistros";
    }
    @GetMapping("/bistros/new")
    public String showNewForm(Model model) {
        model.addAttribute("bistro", new Bistro());
        model.addAttribute("pageTitle","Add New Rate");
        return "bistro_form";
    }

}
