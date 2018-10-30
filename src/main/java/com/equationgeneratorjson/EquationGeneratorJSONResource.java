// RESTful equation generator that returns JSON.
package com.equationgeneratorjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path( "equation" )
public class EquationGeneratorJSONResource
{
   static Random randomObject = new Random(); // random number generator

   // retrieve an equation formatted as JSON
   @GET
   @Path( "{operation}/{level}" )
   @Produces( "application/json" )
   public String getJson( @PathParam( "operation" ) String operation,
      @PathParam( "level" ) int level )
   {
      // compute minimum and maximum values for the numbers
      int minimum = ( int ) Math.pow( 10, level - 1 );
      int maximum = ( int ) Math.pow( 10, level );

      
      // create the numbers on the left-hand side of the equation
      int first = randomObject.nextInt( maximum - minimum ) + minimum;
      int second = randomObject.nextInt( maximum - minimum ) + minimum;

      // create Equation object and return result
      Equation equation = new Equation( first, second, operation );
      String str = "";
      try {
         str = new ObjectMapper().writeValueAsString( equation ); // convert to JSON and return
      } catch (JsonProcessingException e) {
         System.out.println("Can not convert equation to Json.");
      }

      return str;
   } // end method getJson
} // end class EquationGeneratorJSONResource
