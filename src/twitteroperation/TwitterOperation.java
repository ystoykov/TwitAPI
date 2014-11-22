package twitteroperation;



import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterOperation {

	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey("h08bdPNWLtDULAYw3lYTz2ZeJ")
			.setOAuthConsumerSecret("y9GnMANqB05vso13inH9TKL0cHVce0fNf9vi924UmOmVscFqiS")
			.setOAuthAccessToken("732936373-Gp2nt8ZDk6ciMBqg7KEAhfHwJX0BYxkRCq0D0teS")
			.setOAuthAccessTokenSecret("pWTkFV5toNAAr5AWvVeqSF0fB5YYz1h61RvbtjfioJJI3");
		 
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
