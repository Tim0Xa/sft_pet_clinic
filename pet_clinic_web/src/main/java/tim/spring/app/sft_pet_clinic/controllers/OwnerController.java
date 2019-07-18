package tim.spring.app.sft_pet_clinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html","/ownerIndex","/ownerIndex.html"})
    public String ownerList(){
        return "owners/ownerIndex";
    }
}
