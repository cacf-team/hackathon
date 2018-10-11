
package org.hackathon.packapp.containerbank.repository;

import java.util.Collection;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.hackathon.packapp.containerbank.model.BaseEntity;
import org.hackathon.packapp.containerbank.model.Customer;
import org.hackathon.packapp.containerbank.util.RestUtil;

/**
 * Repository class for <code>Customer</code> domain objects All method names are compliant with Spring Data naming
 * conventions so this interface can easily be extended for Spring Data See here: http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 * @author Wavestone
 */
public class CustomerServiceConsumer {
	
	
	@Value("${service.url}")
	private String serviceUrl;
	
	private static String CUSTOMER_PATH= "/customers/"; 
	

    /**
     * Retrieve <code>Customer</code>s from the data store by last name, returning all customers whose last name <i>starts</i>
     * with the given name.
     *
     * @param lastName Value to search for
     * @return a <code>Collection</code> of matching <code>Customer</code>s (or an empty <code>Collection</code> if none
     * found)
     */
    public Collection<Customer> findByLastName(String lastName) {
    	
    	
    	WebClient wc = RestUtil.getWebClient(serviceUrl+CUSTOMER_PATH);
    	Response rp = wc.get();
    	if(rp.getStatus() == 200) {
    		return rp.readEntity(new GenericType<Collection<Customer>>() {
            });
    	}
    	return null;
    }
  

    /**
     * Retrieve an <code>Customer</code> from the data store by id.
     *
     * @param id the id to search for
     * @return the <code>Customer</code> if found
     * @throws org.springframework.dao.DataRetrievalFailureException if not found
     */
     public Customer findById(int id) {
    	WebClient wc = RestUtil.getWebClient(serviceUrl+CUSTOMER_PATH+id);
    	Response rp = wc.get();
    	if(rp.getStatus() == 200) {
    		return rp.readEntity(Customer.class);
    	}
    	return null;
    }


    /**
     * Save an <code>Customer</code> to the data store, either inserting or updating it.
     *
     * @param customer the <code>Customer</code> to save
     * @see BaseEntity#isNew
     */
    public void save(Customer customer) {
    	WebClient wc = RestUtil.getWebClient(serviceUrl+CUSTOMER_PATH);
        wc.post(customer);
    }


}
