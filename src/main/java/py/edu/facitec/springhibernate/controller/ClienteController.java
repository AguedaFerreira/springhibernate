package py.edu.facitec.springhibernate.controller;

import javax.transaction.Transactional;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.springhibernate.dao.ClienteDAO;
import py.edu.facitec.springhibernate.model.Cliente;

@Transactional
@Controller
public class ClienteController {
	
	@Autowired //Inyecta el objeto dao ya creado
	private ClienteDAO ClienteDAO;

	@RequestMapping("/clientes")// inyecta los datos dentro del objeto
	public String save(Cliente cliente){
		
		ClienteDAO.save(cliente);
		return "clientes/ok";
	}
	
	@RequestMapping("/clientes/formulario")
	public String formulario(){
		return "/clientes/formulario";
	}
}
