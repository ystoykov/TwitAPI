package twitteroperation;

import java.io.FileReader;
import java.util.Properties;

public class OauthForTwitter {
	
	private String consumerKey;
	private String consumerSecret;
	private String token;
	private String tokenSecret;
	
	
	OauthForTwitter()
	{
		try (FileReader reader = new FileReader("oauth.properties"))
		{
			Properties properties = new Properties();
			properties.load(reader);
			setConsumerKey(properties.getProperty("consumer_key"));
			setConsumerSecret(properties.getProperty("consumer_secret"));
			setToken(properties.getProperty("access_token"));
			setTokenSecret(properties.getProperty("access_token_secret"));
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	public String getConsumerKey() {
		return consumerKey;
	}
	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenSecret() {
		return tokenSecret;
	}

	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}



}
