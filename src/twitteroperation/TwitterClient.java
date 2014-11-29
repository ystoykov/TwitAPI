package twitteroperation;

public interface TwitterClient {
	
	public  void postStatus();
	
	public void getStatus(String username);
	
	public void getUserTimeline(String username);
	

}
