/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.gson.Gson;
;
import com.google.gson.GsonBuilder;
/**
 *
 * @author Simon Yates
 */
public class GsonReader {


    String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

Gson gson = new Gson();

Car car = gson.fromJson(json, Car.class);

}

  

        

