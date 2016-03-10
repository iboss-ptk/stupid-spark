import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/**
  * Created by ibosz on 10/3/59.
  */
object Main extends App{
  System.setProperty("SPARK_YARN_MODE", "true")

  val sparkConfig = new SparkConf()
    .setAppName("test")
    .setMaster("yarn-client")

  val sparkContext = new SparkContext(sparkConfig)

  val numbersRDD = sparkContext.parallelize(List(1, 2, 3, 4, 5))

  println {
    s"result is ${numbersRDD.reduce(_ + _)}"
  }
}
