package py.edu.facitec.springhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Indicamos que la clase gestionara las peticiones del navegador o cliente
@Controller
public class HomeController {
	//Responde a la ULR / que es la raiz del proyecto
	@RequestMapping("/")
	public String index(){
		
		System.out.println("Cargando la página de Bienvenida");
		return "hello-world";
	}
}
