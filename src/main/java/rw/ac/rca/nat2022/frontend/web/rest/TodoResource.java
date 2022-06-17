package rw.ac.rca.nat2022.frontend.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import rw.ac.rca.nat2022.frontend.pojo.User;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/todos")
public class TodoResource {

    @GetMapping("/set-session")
    public String setSession(HttpServletRequest request) {
        request.getSession().setAttribute("user_id", "My new USER ID");
        return "todos/all";
    }

    @GetMapping
    public String viewAll(Model model, HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> userResponse = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", User[].class);
        model.addAttribute("users", userResponse.getBody());

        return "todos/all";
    }

    @PostMapping
    public String add(String title, String description) {
        System.out.println("title: " + title + " description: " + description);
        return "todos/all";
    }
}
