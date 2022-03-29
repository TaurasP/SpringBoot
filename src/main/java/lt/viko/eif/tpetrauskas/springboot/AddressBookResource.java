package lt.viko.eif.tpetrauskas.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// http://localhost:8080/swagger-ui/
/*@RestController
@RequestMapping("/api")
public class AddressBookResource {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id) {
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @PostMapping("/")
    public Contact addContacts(@RequestBody Contact contact) {
        contacts.put(String.valueOf(contact.getId()), contact);
        return contact;
    }

}*/
