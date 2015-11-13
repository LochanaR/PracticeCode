package org.wso2.carbon.mss.loch.testcasetwo;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import java.util.stream.Stream;

/**
 * Created by lochana
 */
@Path("/members")
public class MemberServices {

    static List<Member> members = new ArrayList<>();

    @GET
    @Produces("text/plain")
    public String addFounders() {
        members.add(new Member("Lochana", 22));
        members.add(new Member("Janitha", 23));

        return "added founders!";
    }

    @Path("/view_members")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Member> viewMembers() {
        return members;
    }


    @Path("/help")
    @Produces("text/plain")
    public String showHelp() {
        return "Use /{memberName}/{Age} to register<br />Or /view_members to view members";
    }

    @POST
    @Path("/join_club/{memberName}/{Age}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/plain")
    public String addMember(@PathParam("memberName") String memberName,
                            @PathParam("Age") int memberAge) {
        members.add(new Member(memberName, memberAge));
              return "Member added!";
    }


}

