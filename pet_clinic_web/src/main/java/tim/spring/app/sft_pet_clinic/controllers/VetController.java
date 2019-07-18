package tim.spring.app.sft_pet_clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/vetIndex","/vets/vetIndex.html"})
    public String listVets(){
        return "vets/vetIndex";
    }
}
