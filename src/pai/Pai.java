package pai;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Pai {
	
	private Logger logger = (Logger) LogManager.getLogger(Pai.class);
	
	private String pai;
	
	public Pai() {
	}
	
	public String getPai() {
		logger.debug("GET - Mensagem de Debug " + pai);
		logger.info("GET - Mensagem de Info " + pai);
		logger.error("GET - Mensagem de Error " + pai);
		return pai;
	}
	
	public void setPai(String pai) {
		logger.debug("SET - Mensagem de Debug " + pai);
		logger.info("SET - Mensagem de Info " + pai);
		logger.error("SET - Mensagem de Error " + pai);
		this.pai = pai;
	}

}
