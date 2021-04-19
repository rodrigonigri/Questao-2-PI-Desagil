package br.edu.insper.desagil.marketing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private static double DELTA = 0.01;
	
	private Usuario u1;
	private Video v;
	private List<Video> videos;
	
	
	@BeforeEach
	public void setUp() {
		u1 = new Usuario("Hashi");
		videos = new ArrayList<>();
	}
	
	
	@Test
	public void avaliacoesInvalidas() {
		u1.postaVideo(1, new Produto("cadeira", 50.00));
		
		v.adicionaAvaliacao(new Usuario("Hugo"),0);
		v.adicionaAvaliacao(new Usuario("Hugo"),6);
		v.adicionaAvaliacao(new Usuario("Hashi"),3);
		
		assertEquals(0, u1.totalAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void avaliacaoValida() {
		u1.postaVideo(1, new Produto("cadeira", 50.00));
		
		v.adicionaAvaliacao(new Usuario("Hugo"),3);
		assertEquals(3, u1.totalAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void avaliacoeValidasCima() {
		u1.postaVideo(1, new Produto("cadeira", 50.00));
		
		v.adicionaAvaliacao(new Usuario("Hugo"),3);
		assertEquals(3, u1.totalAvaliacoes(), DELTA);
		
	}
}
