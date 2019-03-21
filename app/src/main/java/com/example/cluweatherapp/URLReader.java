package com.example.cluweatherapp;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception{
        //Website URL
        URL weatherMap = new URL("http://api.openweathermap.org/data/2.5/weather?zip=91360,us&appid=9035a183aea3ebf0f7fe2c28dc04c7b3");
        //creates a connection object, but does not establish the connection yet.
        URLConnection connection = weatherMap.openConnection();
        //getInputStream() opens connection to obtain input from connection object output stream
        //InputStreamReader() reads bytes and decodes them into characters
        /*Buffered reader reads text from char input stream in chunks and stores them in an internal buffer.
          Reader then reads from buffer instead of underlying stream, which minimizes number of i/o operations.
          In general, each read request made of a reader causes corresponding read request to be made of underlying byte stream.
          It is therefore good practice to wrap BufferedReader around any reader whose read() operations may be costly,
          such as FIleReaders and InputReaders*/
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        //String declared
        String inputLine;


//        while((inputLine = in.readLine()) != null){
//            System.out.println(inputLine);
//        }
//        in.close();

        inputLine = in.readLine();
        System.out.println(inputLine);

        //commit here by other user (MasterBuilder747)
        System.out.println("Commit test");

        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        Complete complete = objectMapper.readValue(inputLine, Complete.class);

        System.out.println(complete.main.humidity);
    }
}

