package com.cqsudu.lightning.service.client;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException, InterruptedException {
        Request.Builder builder = new Request.Builder();
//        Request request = builder.url("http://example-kong.org/api/service/test.json")
        Request request = builder.url("http://api-op.yywh.ltd/api/authz/user/info.json?access_token=4a017f8a-c5ba-4b03-990c-69395602bef9")
                .build();
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        do {
            run2(request, okHttpClient);
            Thread.sleep(1000);
        }while (true);

    }

    private static void run2(Request request, OkHttpClient okHttpClient) {
        for (int i = 0 ; i <= 30; ++i){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Call call = okHttpClient.newCall(request);
                    Response execute = null;
                    try {
                        execute = call.execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String string = null;
                    try {
                        string = execute.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(string);
                    execute.close();
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
