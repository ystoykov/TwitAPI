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
			consumerKey = properties.getProperty("consumer_key");
			consumerSecret = properties.getProperty("consumer_secret");
			token = properties.getProperty("access_token");
			tokenSecret = properties.getProperty("access_token_secret");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	public String getConsumerKey() {
		return consumerKey;
	}


	public String getConsumerSecret() {
		return consumerSecret;
	}


	public String getToken() {
		return token;
	}


	public String getTokenSecret() {
		return tokenSecret;
	}

}
