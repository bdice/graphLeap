// graphLeap main class
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class graphLeap {

	/**
	 * @param args
	 * @throws TwitterException 
	 * @throws IllegalStateException 
	 */
	public static void main(String[] args) throws IllegalStateException, TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		System.out.println(twitter.getHomeTimeline());
	}

}