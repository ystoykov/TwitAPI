package twitteroperation;

import java.io.FileReader;
import java.util.Properties;

import twitter4j.conf.ConfigurationBuilder;

public class OauthForTwitter {
	
	private String CONSUMER_KEY;
	private String CONSUMER_SECRET;
	private String TOKEN;
	private String TOKEN_SECRET;
	
	OauthForTwitter()
	{
		try (FileReader reader = new FileReader("oauth.properties"))
		{
			Properties properties = new Properties();
			properties.load(reader);
			CONSUMER_KEY =  properties.getProperty("consumer_key");
			CONSUMER_SECRET =  properties.getProperty("consumer_secret");
			TOKEN = properties.getProperty("access_token");
			TOKEN_SECRET = properties.getProperty("access_token_secret");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(CONSUMER_KEY)
			.setOAuthConsumerSecret(CONSUMER_SECRET)
			.setOAuthAccessToken(TOKEN)
			.setOAuthAccessTokenSecret(TOKEN_SECRET);
		return;
	}

}
