package com.mycompany.assent.dao;

import com.mycompany.assent.domain.Contact;
import java.util.List;

/**
 *
 * @author assent2
 */
public interface ContactDAO {
    

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
