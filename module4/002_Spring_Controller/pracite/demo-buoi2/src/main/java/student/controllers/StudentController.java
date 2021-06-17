package student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import student.model.Student;
import student.service.IStudentService;

import java.util.List;
@RequestMapping(value = "/student")
@Controller
public class StudentController {
    @Autowired
    private IStudentService  iStudentService;
    @GetMapping(value = {"","/list"})
    public ModelAndView goListStudent(){
        ModelAndView modelAndView =new ModelAndView("list_student");
        List<Student> studentList=iStudentService.findAll();
        modelAndView.addObject("studentList",studentList);
        return modelAndView;
    }
    @GetMapping(value = "/detail")
    public String goDetailStudent(@RequestParam Integer idStudent, Model model){
        model.addAttribute("studentObj",this.iStudentService.findById(idStudent));
        return "detail_student";
    }
    @GetMapping(value = "/detail/{idStudent}")
    public String goDetailStudentPV(@PathVariable Integer idStudent, Model model){
        model.addAttribute("studentObj",this.iStudentService.findById(idStudent));
        return "detail_student";
    }
    @GetMapping("/create")
    public String goCreateNewStudent(Model model){
        model.addAttribute("student",new Student());
      return "create_student";
    }
    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        this.iStudentService.save(student);
        redirectAttributes.addFlashAttribute("msg","Create new successfully!");
    return "redirect:/student/list";
    }
}
