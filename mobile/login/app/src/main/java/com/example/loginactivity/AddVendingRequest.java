package com.example.loginactivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class AddVendingRequest extends StringRequest{
    final static private String URL = "http://ec2-3-34-207-199.ap-northeast-2.compute.amazonaws.com/mobile/addvending";
    private Map<String, String> vending_parameters;

    public AddVendingRequest(String vending_name, String vending_comment, String vending_size, String vending_SN, Response.Listener<String> listener){
        super (Method.POST, URL, listener, null);
        vending_parameters = new HashMap<>();
        vending_parameters.put("vending_name", vending_name);
        vending_parameters.put("vending_comment", vending_comment);
        vending_parameters.put("vending_size", vending_size);
        vending_parameters.put("vending_SN", vending_SN);
    }
    public Map<String, String> getVending_parameters(){
        return vending_parameters;
    }
}
