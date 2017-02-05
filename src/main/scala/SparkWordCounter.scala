import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by datablock on 2/5/17.
  */
object SparkWordCounter {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SparkWordCounter")
    val sc = new SparkContext(conf)

    val tf = sc.textFile(args(0))
    val splits = tf.flatMap(line => line.split(" ")).map(word =>(word, 1))
    val counts = splits.reduceByKey((accumValue, newValue) => accumValue + newValue)
                          .sortBy(kvPair => kvPair._2, false)

    counts.saveAsTextFile(args(1))
    splits.saveAsTextFile(args(2))
  }

}
