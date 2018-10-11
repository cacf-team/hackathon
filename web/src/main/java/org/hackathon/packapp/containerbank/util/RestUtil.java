package org.hackathon.packapp.containerbank.util;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class RestUtil {

	/**
	 * Instance Logger.
	 */
	protected static final Logger LOGGER = LoggerFactory.getLogger(RestUtil.class);

	public static final String VALIDATE_PATH = "/SESAME/remoting/jwt/create";

	/**
	 * Default Constructor
	 * 
	 */
	private RestUtil() {
		super();
	}

	public static <T> String toJson(T obj) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error converting app context to json : {0} ", e);
			throw new Exception("error in  converting app context to json", e);
		}
	}

	public static WebClient getWebClient(String Url) {

		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJaxbJsonProvider());
		WebClient wc = WebClient.create(Url, providers);
		wc.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		ClientConfiguration config = WebClient.getConfig(wc);
		config.getInInterceptors().add(new LoggingInInterceptor());
		config.getOutInterceptors().add(new LoggingOutInterceptor());

		return wc;

	}


}