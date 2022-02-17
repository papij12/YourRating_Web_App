package com.Task4.Task4.Controller;

import com.Task4.Task4.Entity.Bistro;
import com.Task4.Task4.Service.BistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
