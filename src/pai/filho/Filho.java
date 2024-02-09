package pai.filho;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Filho {
	
	private Logger logger = (Logger) LogManager.getLogger(Filho.class);
	
	private String filho;
	
	public Filho() {
	}
	
	public String getFilho() {
		logger.debug("GET - Mensagem de Debug " + filho);
		logger.info("GET - Mensagem de Info " + filho);
		logger.error("GET - Mensagem de Error " + filho);
		return filho;
	}
	
	public void setFilho(String filho) {
		logger.debug("SET - Mensagem de Debug " + filho);
		logger.info("SET - Mensagem de Info " + filho);
		logger.error("SET - Mensagem de Error " + filho);
		this.filho = filho;
	}

}
