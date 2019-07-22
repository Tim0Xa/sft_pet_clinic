package tim.spring.app.sft_pet_clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tim.spring.app.sft_pet_clinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html","/ownerIndex","/ownerIndex.html"})
    public String ownerList(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/ownerIndex";
    }
}
