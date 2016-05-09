import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

public class Main {

    public static void main(String[] args) {
        String appName = "grouch-VIP";
        String master = "yarn-client"; // or "yarn-cluster" see: https://spark.apache.org/docs/1.3.0/running-on-yarn.html
        SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
        JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(1));

        jssc.start();
        jssc.stop(true, true);
        //System.exit(0);
    }
}
