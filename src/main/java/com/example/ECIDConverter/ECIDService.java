/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ECIDConverter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import weblogic.diagnostics.context.DiagnosticContextHelper;

/**
 *
 * @author tarakhan
 */
@Path("demo")
@Produces("application/json")
public class ECIDService {
    
    private static Logger logger = LogManager.getLogger(ECIDService.class);
    
    @GET
    public Response printECID(){
        logger.info("start of printECID method");
        logger.info("ECID is {}",DiagnosticContextHelper.getContextId());
        logger.info("end of printECID method");
        return Response.ok(DiagnosticContextHelper.getContextId()).build();
    }
    
}
