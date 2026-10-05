package com.springai.init.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ConsultaMedicaServiceImpl implements ConsultaMedicaService {
	
	ChatClient chatClient;
	

	public ConsultaMedicaServiceImpl(ChatClient chatClient) {
		super();
		this.chatClient = chatClient;
	}


	@Override
	public String consultaSintoma(String sintoma) {
		String prompt="Explica posibles causas de este síntoma médico añadiendo una nota al final recomendando acudir a especialista: " + sintoma;
		return chatClient
				.prompt()
				.user(prompt)
				.call()
				.content();
	}

}
