package twitteroperation;

import twitter4j.conf.ConfigurationBuilder;

public class Authorization {
	
	String CONSUMER_KEY;
	String CONSUMER_SECRET;
	String TOKEN;
	String TOKEN_SECRET;
	
	Authorization () throws Exception{
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(CONSUMER_KEY)
			.setOAuthConsumerSecret(CONSUMER_SECRET)
			.setOAuthAccessToken(TOKEN)
			.setOAuthAccessTokenSecret(TOKEN_SECRET);
		return;
	}

}
