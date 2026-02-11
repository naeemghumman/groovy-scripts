@Grapes([
        @Grab(group = 'io.javalin', module = 'javalin', version = '6.7.0'),
        @Grab(group = 'org.slf4j', module = 'slf4j-simple', version = '2.0.17', scope = 'test')
])

import io.javalin.Javalin

// https://javalin.io/
def app = Javalin.create()
        .get("/") { ctx -> ctx.result("Welcome to Javalin!") }
        .start(7076)

println "Javalin server running on http://localhost:${app.port()}"