java -Xms128M -Xmx1200M -Xss20M -XX:MaxPermSize=1200m -XX:+CMSClassUnloadingEnabled -jar `dirname $0`/sbt-launch.jar "$@"
