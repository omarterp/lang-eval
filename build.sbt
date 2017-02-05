name := "SparkFundamentals"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.6.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-sql_2.10" % "1.6.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.hadoop" % "hadoop-common" % "2.7.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-sql_2.10" % "1.6.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-hive_2.10" % "1.6.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy"),
  "org.apache.spark" % "spark-yarn_2.10" % "1.6.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy")
)
    