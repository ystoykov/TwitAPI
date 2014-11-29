package twitteroperation;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterOperation implements TwitterClient {
	
	static ConfigurationBuilder cb = new ConfigurationBuilder();
	static TwitterFactory tf = new TwitterFactory(cb.build());
	static twitter4j.Twitter tw = tf.getInstance();
	static twitter4j.Status st =null;
	

	
	public  void InitOauth()  {	
		OauthForTwitter oauth = new OauthForTwitter();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(oauth.getConsumerKey())
			.setOAuthConsumerSecret(oauth.getConsumerKey())
			.setOAuthAccessToken(oauth.getToken())
			.setOAuthAccessTokenSecret(oauth.getTokenSecret()); 
			
	}

	@Override
	public void postStatus() {

			try {
				Status stat =  tw.updateStatus("Пробный для клиента!");
				System.out.println("Twitter updated");
			} catch (TwitterException e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void getStatus(String username) {
		st.getText();
	}

	@Override
	public void getUserTimeline(String username) {
		List<Status> statuses = null;
		try {
			statuses = tw.getUserTimeline(username);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		for (Status status1 : statuses)
		{
			System.out.println(status1.getUser().getName() + ":" + status1.getText());
		}
		
	}

}
