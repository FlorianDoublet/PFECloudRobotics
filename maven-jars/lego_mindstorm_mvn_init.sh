# mvn install:install-file -Dfile=/home/occiware/workspace/PFECloudRobotics/jars/lego_mindstorm-0.1.0-SNAPSHOT.jar -DgroupId=Clouddesigner -DartifactId=lego_mindstorm -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar
# mvn install:install-file -Dfile=/home/occiware/workspace/PFECloudRobotics/jars/lego_mindstorm.connector-0.1.0-SNAPSHOT.jar -DgroupId=Clouddesigner -DartifactId=lego_mindstorm.connector -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar
mvn install:install-file -Dfile="./LegoMindstorm2_fat (1).jar" -DgroupId=lego_mindstorm -DartifactId=legodriver -Dversion=1.0.0 -Dpackaging=jar

mvn install:install-file -Dfile=./lego_mindstorm-0.1.0-SNAPSHOT.jar -DgroupId=Clouddesigner -DartifactId=lego_mindstorm -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar
mvn install:install-file -Dfile=./lego_mindstorm.connector-0.1.0-SNAPSHOT.jar -DgroupId=Clouddesigner -DartifactId=lego_mindstorm.connector -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar

mvn install:install-file -Dfile=./PFETurtlebotControl-0.1.0-SNAPSHOT.jar -DgroupId=PFETurtlebotControl -DartifactId=PFETurtlebotControl -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar

mvn install:install-file -Dfile=./turtlebot.connector-0.1.0-SNAPSHOT.jar -DgroupId=Clouddesigner -DartifactId=turtlebot.connector -Dversion=0.1.0-SNAPSHOT -Dpackaging=jar