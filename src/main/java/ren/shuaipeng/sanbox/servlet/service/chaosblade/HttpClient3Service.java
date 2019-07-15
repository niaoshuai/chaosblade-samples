package ren.shuaipeng.sanbox.servlet.service.chaosblade;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

/**
 * org.apache.commons.httpclient.HttpClient
 */
public class HttpClient3Service {

    public static void getBaidu() throws IOException {
        HttpClient client = new HttpClient();

        GetMethod get = new GetMethod();
        get.setURI(new URI("http://www.baidu.com/",true));
        // execute method and handle any error responses.
        int i = client.executeMethod(get);
        get.getStatusCode();
    }

}
