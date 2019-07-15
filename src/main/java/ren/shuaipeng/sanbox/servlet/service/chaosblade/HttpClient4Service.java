package ren.shuaipeng.sanbox.servlet.service.chaosblade;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.net.URI;

/**
 * org.apache.commons.httpclient.HttpClient
 */
public class HttpClient4Service {

    public static void getBaidu() throws IOException {
        HttpClient client = HttpClients.createDefault();

        HttpGet get = new HttpGet();
        get.setURI(URI.create("http://www.baidu.com"));

        HttpResponse response = client.execute(get);
        StatusLine statusLine = response.getStatusLine();
//        System.out.println(statusLine);
    }
}
