package controllers;

import io.javalin.Javalin;

public class HelloWorld {

    private static final String HELLOWORLD = "Hello World!";

    Javalin app = Javalin.create().start(7001);

    public Javalin getApp() {

        return app.get("/hello", ctx -> ctx.result(HELLOWORLD));
    }
}
