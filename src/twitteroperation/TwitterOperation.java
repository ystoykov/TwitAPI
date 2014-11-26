package twitteroperation;




import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterOperation {

	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		OauthForTwitter oauth = new OauthForTwitter();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(oauth.getConsumerKey())
			.setOAuthConsumerSecret(oauth.getConsumerKey())
			.setOAuthAccessToken(oauth.getToken())
			.setOAuthAccessTokenSecret(oauth.getTokenSecret());
		 
			TwitterFactory tf = new TwitterFactory(cb.build());
			
			twitter4j.Twitter tw = tf.getInstance();
			
			// Post
			
			//Status stat =  tw.updateStatus("Proba");
			
			//System.out.println("Twitter updated");
			
			// Read 
			List<Status> statuses = tw.getUserTimeline("cfcnightmare");
			
			
			for (Status status1 : statuses)
			{
				System.out.println(status1.getUser().getName() + ":" + status1.getText());
			}
	}

}
