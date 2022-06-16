package rw.ac.rca.nat2022.frontend.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import rw.ac.rca.nat2022.frontend.pojo.User;

@Controller
@RequestMapping("/todos")
public class TodoResource {

    @GetMapping
    public String viewAll(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> userResponse = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", User[].class);
        model.addAttribute("users", userResponse.getBody());
        return "todos/all";
    }
}
