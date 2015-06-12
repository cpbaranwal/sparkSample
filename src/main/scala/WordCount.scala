
import org.apache.spark._
import org.apache.spark.SparkContext._

/**
 * @author priya
 */
object WordCount {
  
  def main(args: Array[String]) {
    
  println("My first Spark hdfs IO program using sbt with cache on eclipse....finally!!!  :)   " )
    val conf = new SparkConf().setAppName("Spark IO Sample")
    val sc = new SparkContext(conf)
  val file = sc.textFile("hdfs://localhost:9000/data/test1.txt");
  val counts = file.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_)
  counts.saveAsTextFile("/data/counts_16may");
    
  }
}