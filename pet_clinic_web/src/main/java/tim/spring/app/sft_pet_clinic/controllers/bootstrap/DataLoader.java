package tim.spring.app.sft_pet_clinic.controllers.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tim.spring.app.sft_pet_clinic.model.Owner;
import tim.spring.app.sft_pet_clinic.model.Pet;
import tim.spring.app.sft_pet_clinic.model.Vet;
import tim.spring.app.sft_pet_clinic.services.OwnerService;
import tim.spring.app.sft_pet_clinic.services.PetService;
import tim.spring.app.sft_pet_clinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1);
        owner1.setFirstName("Me");
        owner1.setLastName("and My name");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2);
        owner2.setFirstName("Mister");
        owner2.setLastName("Smith");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3);
        owner3.setFirstName("Hello");
        owner3.setLastName("World Guy");
        ownerService.save(owner3);

        Owner owner4 = new Owner();
        owner4.setId(4);
        owner4.setFirstName("PiOdar");
        owner4.setLastName("Kuskovitch");
        ownerService.save(owner4);

        System.out.println("Owners are Done! Hi Chuck");

        Vet vet1 = new Vet();
        vet1.setId(1);
        vet1.setFirstName("Som");
        vet1.setLastName("Vet");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2);
        vet2.setFirstName("Doctor");
        vet2.setLastName("Yes");
        vetService.save(vet2);

        System.out.println("Vets are saved!");

        Pet pet1 = new Pet();
        pet1.setId(1);
        pet1.setOwner(owner1);
        pet1.setNickName("Fluffy");
        petService.save(pet1);

        Pet pet2 = new Pet();
        owner2.setId(2);
        pet1.setOwner(owner2);
        pet1.setNickName("Buffy");
         petService.save(pet2);

        Pet pet3 = new Pet();
        pet3.setId(3);
        pet3.setOwner(owner3);
        pet3.setNickName("Duppy");
        petService.save(pet3);

        System.out.println("pets are saved!");

    }
}
