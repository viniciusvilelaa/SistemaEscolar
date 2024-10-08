package br.imd.SistemaEscolar;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SistemaEscolarApplication {


	String application_Name;


	public SistemaEscolarApplication(String application_Name) {
		this.application_Name = application_Name;
	}

	@GetMapping("/nome")
	public String olaMundo() {
		return application_Name;
	}


	public static void main(String[] args) {
		SpringApplication.run(SistemaEscolarApplication.class, args);
	}

}
