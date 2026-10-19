package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/customer")
public class CustomerController {
    @GetMapping("/{id}")

    public Customer getbyId(@PathVariable Long id){
        Address address = new Address("115 New Cavendish Street", "London", "W1W 6UW");

        return new Customer("Ada Lovelace", "ada@example.com", id, address);

    }
}
