Minimal Spark Streaming project
===

How To Run
---
```
mvn package
# on a YARN Namenode with Spark installed
spark-submit --class Main --master yarn-cluster target/literate-palm-tree-0.1.jar
```