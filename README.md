# Mentoring app

* [Spring Modulith](https://spring.io/projects/spring-modulith)
* [ArchUnit](https://www.archunit.org/)
* [C4](https://c4model.com/)
* [JDepend](https://github.com/clarkware/jdepend)
* IDEA Code / Analyze Code / Dependencies
  * https://www.jetbrains.com/help/idea/dsm-analysis.html

```shell
docker run -d -e POSTGRES_DB=mentoring -e POSTGRES_USER=mentoring -e POSTGRES_PASSWORD=mentoring -p 5432:5432  --name mentoring-postgres postgres
```

```shell
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin
```

Elérhető a `http://localhost:9411` címen

Függőségek:

```shell
mvnw jdepend:generate
```