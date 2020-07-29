package com.example.loginactivity;

import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SignupRequest extends StringRequest {

    // 서버 URL 설정
    final static private String URL = "http://ec2-3-34-207-199.ap-northeast-2.compute.amazonaws.com/mobile/signup";
    private Map<String, String> map;

    public SignupRequest(String userName, String userId, String userPasswd, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userName", userName);
        map.put("userId", userId);
        map.put("userPasswd", userPasswd);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
