/**
 * Created by fin01 on 2014/05/31.
 */

import twitter4j.conf.ConfigurationBuilder
import twitter4j.TwitterFactory
import twitter4j.Status

object TwitterMain {
  def main(args: Array[String]) {
    val cb = new ConfigurationBuilder()
    cb.setDebugEnabled(false)
      .setHttpProxyHost("proxy")
      .setHttpProxyPort(8080)
      .setOAuthConsumerKey("Xz7SZlSoCbGW7exm9zQYoUPxF")
      .setOAuthConsumerSecret("TQuHoTZP8s3kg7CvGbAoijdgs1xysqA9w2fA0vBjIzgyKZbvhC")
      .setOAuthAccessToken("89462095-0C7FWRq51EuiE4RcKTpco6XLfw4KZRmLuv0tp8dgj")
      .setOAuthAccessTokenSecret("mAniHcpfPNq9ZRLF8DXqSqKoMFeXduJMjj11YRPeR9b5Q")
    val tf = new TwitterFactory(cb.build())
    val twitter = tf.getInstance()
    println(twitter.getAccountSettings)

    import collection.JavaConversions._
    val statuses = twitter.getHomeTimeline
    println("Showing home timeline.")
    for (status: Status <- statuses) {
      println(status.getUser.getName + ":" + status.getText)
    }

    twitter.updateStatus("俺のクライアント")
  }
}
