/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assent.service;

import com.mycompany.assent.dao.ContactDAO;
import com.mycompany.assent.domain.Contact;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author assent2
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Inject
    private ContactDAO contactDAO;

    public ContactDAO getContactDAO() {
        return contactDAO;
    }

    public void setContactDAO(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @Transactional
    @Override
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    @Override
    public List<Contact> listContact() {

        return contactDAO.listContact();
    }

    @Transactional
    @Override
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}
