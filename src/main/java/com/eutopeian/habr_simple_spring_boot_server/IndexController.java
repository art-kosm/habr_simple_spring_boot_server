package com.eutopeian.habr_simple_spring_boot_server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    final VisitsRepository visitsRepository;

    // можно не писать @Autowired, само подтянется
    public IndexController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Artem");

        Visit visit = new Visit();
        visit.setDescription(String.format("Visited at %s", LocalDateTime.now()));
        visitsRepository.save(visit);

        return new ModelAndView("index", model);
    }
}
