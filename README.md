docker build -t java-hex .


docker run -p 5000:5000 -e PORT=5000 --name container-hex java-hex
 
 