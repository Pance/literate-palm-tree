Minimal Spark Streaming project
===
This project was built upon Spark 1.3

How To Run
---
```
mvn package
# on a YARN Namenode with Spark installed
spark-submit --class Main --master yarn-cluster target/literate-palm-tree-0.1.jar
```