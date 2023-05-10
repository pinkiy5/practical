package com.pinki.batch4119.sb.otohm.SBBbacth411911Hm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.model.Person;
import com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.model.Adhaar;
import com.pinki.batch4119.sb.otohm.SBBbacth411911Hm.repository.PersonRepository;

@SpringBootApplication
public class SbBbacth411911HmApplication implements CommandLineRunner{
    @Autowired
    PersonRepository pr;
	public static void main(String[] args) {
		SpringApplication.run(SbBbacth411911HmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
          Person p1=new Person("pinki yadav","bhiwadi"); 
          Person p2=new Person("rekha yadav","tijara"); 
          Adhaar a1 = new Adhaar(12345);
          Adhaar a2 = new Adhaar(45678);
          p1.setAdha(a1);
          p2.setAdha(a2);
          pr.save(p1);
          pr.save(p2);
          
          
	}

}
