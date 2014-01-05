package com.mycompany.assent.dao;

import com.mycompany.assent.domain.Contact;
import com.mycompany.assent.service.ContactServiceImpl;
import java.util.List;
import javax.inject.Inject;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.Assert;

/**
 *
 * @author assent2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "spring/root-context.xml"
})
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class testContactDAOImpl {
    
    @Inject
    private ContactServiceImpl contactService;

    @Test
    public void test0() {
        Assert.notNull(contactService);
    }

    @Test
    public void test1() {
        System.out.println(" *** contactService.listContact()");
        List<Contact> listContact = contactService.listContact();

        System.out.println(" *** out");
        for (Contact contact : listContact) {
            System.out.println(contact);
        }
        
//        System.out.println(" *** closeSession");
//        contactDAO.getSessionFactory().getCurrentSession().close();
        
        System.out.println(" *** end");
    }
}
