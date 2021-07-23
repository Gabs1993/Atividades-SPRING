package com.HelloWord.PrimeiroProjeto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hallo")
public class HelloController {
	
	@GetMapping ("/rota1")
	public String hello() { 
		return "Trabalho em equipe e muita atenção aos detalhes e persistencia";
	}
	
	@GetMapping ("/rota2") 
	public String hello2() {
		return "Muita persistencia e muito trabalho em equipe, pois como é muito conteudo necessitamos de ajuda para nao desistir hahahahaha";
	}
	

}
