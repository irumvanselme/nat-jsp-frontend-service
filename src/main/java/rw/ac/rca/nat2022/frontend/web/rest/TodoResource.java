package rw.ac.rca.nat2022.frontend.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodoResource {

    @GetMapping
    public String viewAll(Model model) {
        model.addAttribute("username", "anselme");
        return "todos/all";
    }
}
