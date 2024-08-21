# echo "javamon $1"
file=$1
fileName=${file:2:-5}
# echo $file 
# echo $fileName 

nodemon $file --exec "javac $file -d ./classes && java -classpath ./classes $fileName"
