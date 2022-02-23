![Pipeline Projeto](https://github.com/lscheiner/arquitetura-hexagonal-account/blob/main/.github/workflows/pipeline.yml/badge.svg)



docker build -t java-hex .


docker run -p 5000:5000 -e PORT=5000 --name container-hex java-hex
 
 
