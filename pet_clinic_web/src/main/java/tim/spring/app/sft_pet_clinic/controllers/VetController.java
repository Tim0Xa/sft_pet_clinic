package tim.spring.app.sft_pet_clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tim.spring.app.sft_pet_clinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets/vetIndex","/vets/vetIndex.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/vetIndex";
    }
}
