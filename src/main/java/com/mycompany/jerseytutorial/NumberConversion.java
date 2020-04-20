
package com.mycompany.jerseytutorial;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;



@Path("/NumberConverter")
public class NumberConversion {
    @GET
    @Path("/Roman/{param}")
    public Response sayRomanNumToDecimal(@PathParam("param")String romanNumeral){ 
        
        RomanNumeralConverter myRomanNumeralConverter;
        myRomanNumeralConverter = new RomanNumeralConverter();
        myRomanNumeralConverter.setRomanNumeral(romanNumeral);
        myRomanNumeralConverter.romanToDecimalConversion();
        int decimalNum = myRomanNumeralConverter.getDecimalNum();
        
        int output = decimalNum;
        String output1 = romanNumeral+" Roman to Decimal = "+decimalNum;
        //String output = grades + "C to F =" + String.valueOf(grades*9/5+32) + "!";
        //int output = number + "R to D ="+ int.valueOf(decimalNum)+ "!";
        return Response.status(200).entity(output1).build();
    }
        
    @GET
    @Path("/Decimal/{param}")
    public Response saydecimalToRoman(@PathParam("param") int decimal){
        
        DecimalConverter myDecimalConverter;
        myDecimalConverter = new DecimalConverter();
        myDecimalConverter.setDecimal(decimal);
        myDecimalConverter.integerToRoman();
        String roman = myDecimalConverter.getRoman();
        
        String output = roman;
        String output1 = decimal + " in decimal to Roman numeral = "+ roman;
        return Response.status(200).entity(output1).build();

    }
        }
    
