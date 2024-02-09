package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import pai.Pai;
import pai.filho.Filho;
import pai.filho.neto.Neto;

public class Teste {
	
	private static Logger logger = (Logger) LogManager.getLogger(Teste.class);

	public static void main(String[] args) {
		
		Pai pai = new Pai();
		Filho filho = new Filho();
		Neto neto = new Neto();
		
		pai.setPai("Nome Pai");
		filho.setFilho("Nome Filho");
		neto.setNeto("Nome Neto");
		
	}

}
