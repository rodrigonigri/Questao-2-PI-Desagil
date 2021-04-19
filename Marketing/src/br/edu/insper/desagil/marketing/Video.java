package br.edu.insper.desagil.marketing;

import java.util.HashMap;
import java.util.Map;

public class Video {
	
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return this.id;
	}

	public Produto getProduto() {
		return this.produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		if (usuario.getNome() != this.usuario.getNome()) {
			if (avaliacao >= 1) {
				if (avaliacao <= 5) {
					this.avaliacoes.put(usuario.getNome(), avaliacao);
				}
			}
			
		}
	}
	
	public int mediaAvaliacoes() {
		int soma = 0;
		for (int nota: avaliacoes.values()) {
			soma += nota;
		}
		
		double media;
		media = soma/avaliacoes.size();
		long media_arredondada;
		media_arredondada = Math.round(media);
		int media_arredondada_int = (int) media_arredondada;
		return media_arredondada_int;
	}

}
