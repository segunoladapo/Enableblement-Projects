@RestController
class Application {

    @RequestMapping("/")
    String home() {
        "This is Spring Boot application using Groovy"
    }
}