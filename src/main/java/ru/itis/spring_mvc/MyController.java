package ru.itis.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName  = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("descriptionAttribute", " - Java developer");
//
//        return "show-emp-details";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {

        empName  = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("descriptionAttribute", " - Java developer");

        return "show-emp-details";
    }
}
