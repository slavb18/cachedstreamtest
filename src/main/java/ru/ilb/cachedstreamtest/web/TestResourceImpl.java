/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ilb.cachedstreamtest.web;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


@Path("test")
public class TestResourceImpl {

    @GET
    @Produces({"application/xml" })
    public Response list(@QueryParam("limit") @DefaultValue("10") Integer limit) {
        StringBuilder sb=new StringBuilder();
        sb.append("<root>");
        int i;
        for (i=0; i<limit; i++){
            sb.append("<node/>");
        }
        sb.append("</root>");
        return Response.ok(sb.toString()).build();
    }

}
