package lt.viko.eif.tpetrauskas.springboot.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public String viewContactsPage(Model model) {
        model.addAttribute("listContacts", contactService.getAllContacts());
        return "contacts";
    }
}
