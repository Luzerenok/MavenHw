package httpurlconnection.com;

import httpurlconnection.com.httpconnection.HttpURLConnectionClient;
import httpurlconnection.com.httpconnection.MyHttpClient;

public class MainHttpUrlConnection {
    public static void main(String[] args) throws Exception {
        MyHttpClient httpClient = new HttpURLConnectionClient();

        String getUrl = "http://httpbin.org/get";
        String getResponse = httpClient.sendGet(getUrl);
        System.out.println(getResponse);

        String postUrl = "http://httpbin.org/post";
        String body = "{\"creator\": \"Yauheniya Reutskaya\"}";
        String contentType = "application/json";

        String postResponse = httpClient.sendPost(postUrl, body, contentType);
        System.out.println(postResponse);

        String putUrl = "http://httpbin.org/put";
        String putBody = "{\"creator\": \"Yauheniya Reutskaya\",\"updated\": \"successfull\"}";
        String putContentType = "application/json";

        String putResponse = httpClient.sendPut(putUrl, putBody, putContentType);
        System.out.println(putResponse);



    }
}
