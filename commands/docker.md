
| command                                                | description                                                                |
|:-------------------------------------------------------|:---------------------------------------------------------------------------|
| docker --version                                       | покажет установленную версию **docker**                                    |
 | docker search <img_name>                               | поиск image на **DockerHub**                                               |
 | docker pull <img_name>                                 | скачает image с **DockerHub**                                              |
 | docker images                                          | покажет список всех image                                                  |
 | docker ps / ps -all / ps -a                            | список запущенных контенеров, запущенных в background, всех контенеров     |
 | docker run --env ENV_NAME = value --detach <img_name>  | создать контейнер на базе image. **--detach** стартует контейнер           |
 | docker stop <container_name/container_id>              | мягко останавливает контейнер по имени или id                              |
 | docker kill <container_name/container_id>              | немедленно остановит контейнер по имени или id                             | 
 | docker restart <container_name/container_id>           | стартует контенер по имени или id (использовать после перезапуска системы) | 
 | docker exec -it <container_name/container_id> bash     | доступ к контенеру **-it** открывает доступ в интерактивном режиме         |
 | docker login                                           | залогиниться в **DockerHub**                                               |
 | docker logout                                          | разлогиниться в **DockerHub**                                              |
 | docker commit                                          | создать или сохранить изменения image в локальной системе                  |
 | docker push                                            | создать или сохранить изменения image в **DockerHub**                      |
 | docker network ls                                      | показать лист сетей с деталями в текущем кластере                          |
 | docker rmi <image_id>                                  | удалить image с диска                                                      |
 | docker logs <container_name/container_id>              | показать логи контенера                                                    |ide