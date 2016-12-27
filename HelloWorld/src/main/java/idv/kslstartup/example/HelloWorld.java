package idv.kslstartup.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld() {
        return "Hello World!!!";
    }
}
