![Pipeline Java](https://github.com/lscheiner/arquitetura-hexagonal-account/actions/workflows/pipeline.yml/badge.svg)



docker build -t java-hex .


docker run -p 5000:5000 -e PORT=5000 --name container-hex java-hex
 
 
