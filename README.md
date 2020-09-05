# Java Spring Boot RESTAPI
CRUD REST API/Service with Spring Boot, Maven, JPA and Hibernate, MongoDB, Docker

**REST**

Uygulamamızda kullanacağımız örnek REST işlemleri

```sh
GET /kullanicilar
```
```sh
POST /Kullanicilar
```
```sh
POST /Kullanicilar/{id}
```
```sh
PUT /Kullanicilar/{id}
```
```sh
DELETE /Kullanicilar/{id}
```  

**JSON**

Örnek uygulamamızda kullanacağımız örnek .JSON formatı:

```sh
    {
        "a": "Test",
        "b": "TEST",
        "c": {
            "1": "Item1",
            "2": "Item2",
            "3": "Item3"
        }
    }
```  

**DOCKER**

Docker Desktop üzerine MongoDB yüklemek için:

```sh
$ docker pull mongo
```

Docker Desktop üzerinde bulunan MongoDB çalıştırmak için:

```sh
$ docker run --name some-mongo -p 27017:27017 -d mongo
```
