package edu.bzu.app.restapi.controller;

import edu.bzu.app.restapi.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Mohammed Kharma
 */
@RestController
public class HomeController {

    @GetMapping(value = "/")
    public CustomerDto home() {
        return new CustomerDto("Mohammed", "Kharma");
    }
}
