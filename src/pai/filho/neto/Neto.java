package pai.filho.neto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Neto {
	
	private Logger logger = (Logger) LogManager.getLogger(Neto.class);
	
	private String neto;
	
	public Neto() {
	}
	
	public String getNeto() {
		logger.debug("GET - Mensagem de Debug " + neto);
		logger.info("GET - Mensagem de Info " + neto);
		logger.error("GET - Mensagem de Error " + neto);
		return neto;
	}
	
	public void setNeto(String neto) {
		logger.debug("SET - Mensagem de Debug " + neto);
		logger.info("SET - Mensagem de Info " + neto);
		logger.error("SET - Mensagem de Error " + neto);
		this.neto = neto;
	}

}
