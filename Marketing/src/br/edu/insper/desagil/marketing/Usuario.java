package br.edu.insper.desagil.marketing;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	List<Video> videos;
	
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}


	public String getNome() {
		return this.nome;
	}

	public Video postaVideo(int id, Produto produto) {
		Video v = new Video(id, this, produto);
		videos.add(v);
		return v;
	}
	
	public int totalAvaliacoes() {
		int soma = 0;
		for (Video video: videos) {
			soma += video.mediaAvaliacoes();
		}
		return soma;
	}

}
