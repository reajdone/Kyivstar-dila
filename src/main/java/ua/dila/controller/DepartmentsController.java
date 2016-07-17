package ua.dila.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dep")
public class DepartmentsController {
    @RequestMapping(value = "/buh", method = RequestMethod.GET)
    @ResponseBody
    public String getDepartment (ModelMap model){
        return "Бухгалтерия";
    }
}
