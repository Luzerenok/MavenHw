package httpurlconnection.com.httpconnection;

import java.io.IOException;

public interface MyHttpClient {
	String sendGet(String url) throws IOException;
	String sendPost(String url, String body, String contentType) throws IOException;
	String sendPut(String url, String body, String contentType) throws IOException;
}
