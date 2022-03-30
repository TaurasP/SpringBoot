package lt.viko.eif.tpetrauskas.springboot.contact;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
}
