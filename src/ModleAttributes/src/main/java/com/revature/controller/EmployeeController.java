package src.ModleAttributes.src.main.java.com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import src.ModleAttributes.src.main.java.com.revature.beans.Employee;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/empreg", method = RequestMethod.GET)
    public ModelAndView newEmployee(){
        ModelAndView modelAndView = new ModelAndView("EmployeeRegistration","command",new Employee());
        return modelAndView;
    }

    @RequestMapping(value = "/empreg", method = RequestMethod.POST)
    public ModelAndView showEmployee(@ModelAttribute("employee") Employee employee){
        ModelAndView modelAndView = new ModelAndView("ShowEmp");
        modelAndView.addObject("emp",employee);
        return modelAndView;
    }


}
