package com.if3b.quotes.API;

import retrofit2.Retrofit;

public class RetroServer {
    private static final String baseUrl = "https://type.fit/api/";
    private static Retrofit retro;

    public static Retrofit connectRetrofit(){
    if (retro == null){
        retro = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(Gson)
                .build();
        }
    return retro;
    }
}
