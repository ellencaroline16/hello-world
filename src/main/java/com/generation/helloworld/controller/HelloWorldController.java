package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/to-perdida")

public class HelloWorldController {

	// @RestController deﬁne que a Classe é do tipo controladora rest, que receberá
	// requisições que serão compostas por :
	// URL, Verbo,Corpo da requisição

	// RequestMapping é usada para mapear solicitações para os Métodos da Classe
	// controladora
	// HelloWorldController, ou seja, definir a URL (endereço) padrão do recurso (em
	// nosso exemplo: /hello-world). Ao digitar a url do servidor seguida da url do
	// recurso, o Spring envia a requisição para a Classe responsável pelo recurso
	// com este endereço.

	// GetMapping mapeia solicitações HTTP GET para Métodos de tratamento
	// específicos, ou seja,
	// indica que o Método helloWorld() responderá a todas as requisições do tipo
	// HTTP GET, enviadas no endereço http://localhost:8080/hello-world, do recurso
	// hello-world.

	// o Método helloWorld() retorna uma mensagem de boas vindas, ou seja, quando o
	// endereço for enviado via Postman ou via Browser (Navegador), será exibida a
	// mensagem de boas vindas Hello World!!!

	@GetMapping
	public String helloWorld() {
		return " Hello World, que loucura né ?!!!";

	}

	@RequestMapping("/bsms")
	@GetMapping ("/bsms")
	public List<String> getBSMS(){
		List<String>bsmsLista = Arrays.asList("Traballho em equipe", "Atenção aos detalhes", "Proatividade", "Comunicação", "Persistência", "Responsabilidade pessoal", "Orientação ao futuro");
	
		return bsmsLista;
	}
	
	@RequestMapping("/objetivos-bora")
	@GetMapping ("/objetivos")
	public List<String> getObjetivos(){
		List<String>objetivosLista = Arrays.asList("Não acumular atividades", "Entender e treinar a matéria de Spring Boot", "Melhorar a orientação ao detalhe", "Treinar as deficiências dos feedbacks");
	
		return objetivosLista;

	}
}
