/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.sdccd.mesa.cisc190.practice5.server;

import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;    // create
import static io.javalin.apibuilder.ApiBuilder.get;     // read
import static io.javalin.apibuilder.ApiBuilder.patch;   // update
import static io.javalin.apibuilder.ApiBuilder.delete;  // delete

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.javalin.Javalin;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger("Main.class");

    public static void main(String[] args) {
        // initialize the students
        StudentHandler studentHandler = new StudentHandler();

        // initialize the server
        Javalin app = Javalin.create()
                .contextPath("/api/v1")
                .start(7000);

        // get all of the students
        app.get("/students", studentHandler.getAllStudents);
        // get a particular student by id
        app.get("/students/:id", studentHandler.getStudent);
    }
}
