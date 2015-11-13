package org.lochana.advancedREST;

import javax.annotation.Resource;
import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lochana on 11/12/15.
 */
@Path("details")
public class Details {

    static List<User> myUsers = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getDetails(){
        myUsers.add(new User("Josh", 23));
        myUsers.add(new User("Jen", 34));
        myUsers.add(new User("Heidi", 19));
        return myUsers;
    }
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User addNewUser(User anUser){
        System.out.println(anUser.getAge());
        //System.out.println(anUserName);
        myUsers.add(anUser);
        return anUser;
    }

}
