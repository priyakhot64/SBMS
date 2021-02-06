package com.piu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.piu.repo.ResouceRepo;
import com.piu.resource.ResourceDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ResouceRepo repo = context.getBean(ResouceRepo.class);
		
		ResourceDetails resource = new ResourceDetails();
		resource.setResourceId(101);
		resource.setResourceName("Shailesh");
		resource.setResourceSkill("Java");
		resource.setResourceExp(5.2);
		
		ResourceDetails save = repo.save(resource);
		
		if(save!=null) {
			System.out.println("Record Saved...");
		}
		else {
			System.out.println("Failed to save the record...");
		}
	}

}


