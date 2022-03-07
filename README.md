![Pipeline Java](https://github.com/lscheiner/arquitetura-hexagonal-account/actions/workflows/pipeline.yml/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=lscheiner_arquitetura-hexagonal-account&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=lscheiner_arquitetura-hexagonal-account)
[![Heroku](http://heroku-badge.herokuapp.com/?app=heroku-badge&root=projects.html)](https://hexagonal-scheiner.herokuapp.com/)


docker build -t java-hex .


docker run -p 5000:5000 -e PORT=5000 --name container-hex java-hex
 
 
