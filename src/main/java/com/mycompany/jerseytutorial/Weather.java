
package com.mycompany.jerseytutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

@Path("/weather")
public class Weather {
    
    @GET
    @Path("/{param}")
        public Response GetWEatherInfo(@PathParam("param") String city){ 
        String URL = "http://api.openweathermap.org/data/2.5/forecast?q=+city&mode=json&appid=b911ee0022099e2faa831d27bf0908d0";
        Client c = ClientBuilder.newClient();
        Response r = c.target(URL).request().get();
        return r;
        }
     }
    

