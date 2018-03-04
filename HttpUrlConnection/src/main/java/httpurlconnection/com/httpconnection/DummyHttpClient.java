package httpurlconnection.com.httpconnection;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

public class DummyHttpClient implements MyHttpClient {

	public String sendGet(String url) throws IOException {
			HttpClient getApachUrl = new HttpClient() {
			public HttpParams getParams() {
				return null;
			}

			public ClientConnectionManager getConnectionManager() {
				return null;
			}

			public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException, ClientProtocolException {
				return null;
			}

			public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
				return null;
			}

			public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException, ClientProtocolException {
				return null;
			}

			public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
				return null;
			}

			public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
				return null;
			}

			public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
				return null;
			}

			public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
				return null;
			}

			public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
				return null;
			}

			};
		return "dummy get response";
	}


	public String sendPost(String url, String body, String contentType) throws IOException {
		return "dummy post response";
	}

	public String sendPut(String url, String body, String contentType) throws IOException {
		return "dummy put response";
	}


}
