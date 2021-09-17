

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.ContactRepository;
import com.entities.Contact;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyy");
		contactRepository.save(new Contact("yannick", "Ulrich", dateFormat.parse("12/12/1996"), "yang@gmail.com", 45897L, "yan.png"));
		contactRepository.save(new Contact("belva", "djuffo", dateFormat.parse("02/06/1998"), "belg@gmail.com", 45897L, "belva.png"));
		contactRepository.save(new Contact("audrey", "patipe", dateFormat.parse("02/12/2000"), "audreyg@gmail.com", 45897L, "audrey.png"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		
	}

}
