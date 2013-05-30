// graphLeap main class
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class graphLeap {

	/**
	 * @param args
	 * @throws TwitterException 
	 * @throws IllegalStateException 
	 */
	public static void main(String[] args) throws IllegalStateException, TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		ResponseList<Status> theTimeline = twitter.getHomeTimeline();
		for(int i=0; i<theTimeline.size(); i++){
			System.out.println(makeMessage(theTimeline.get(i)));
			System.out.println();
		}
		
	}
	
	public static String makeMessage(Status theStatus){
		String message = new String();
		message += theStatus.getUser().getName();
		message += "  ::  ";
		message += theStatus.getText();
		return message;
	}

}