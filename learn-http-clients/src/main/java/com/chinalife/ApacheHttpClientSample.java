package com.chinalife;

import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * apache HttpClient
 *
 * @author tianyu
 * @version 1.0.0
 * @Date 2023-11-07 11:02:00
 */
public class ApacheHttpClientSample {

    private static final RequestConfig requestConfig = RequestConfig.custom()
            .setConnectionRequestTimeout(2000, TimeUnit.MILLISECONDS)
            .build();


    /**
     * fluent API将用户从手动释放 解放了出来
     * 资源代价：在某些情况下，必须缓冲reponse content到内存中
     */
    public void httpGetFluentApi() {
        try {
            HttpResponse content = Request.get("www.baidu.com").execute().returnResponse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void httpPostFluentApi() {
        try {
            Request.post("www.baidu.com")
                    .bodyForm(Form.form().add("username", "vip").add("password", "secret").build())
                    .execute()
                    .returnContent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * HttpClient native API 实现GET请求
     * <p>
     * HTTP连接仍由response对象持有，以允许从网络socket流式传输(stream directly)响应内容
     * 用户必须在finally{}中调用CloseableHttpResponse#close（），以确保系统资源的正确分配（deallocation）
     * <p>
     * TIPS: 如果response content未完全consumed，底层的连接无法安全的复用，将被连接管理器shut down and discarded
     */
    public void httpGetNative() throws IOException {
        CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
        try {

            ClassicHttpRequest httpGet = ClassicRequestBuilder.get("www.baidu.com").build();
            httpclient.execute(httpGet, response -> {
                final HttpEntity entity = response.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity);
                return null;
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            httpclient.close();
        }
    }

    /**
     * HttpClient native API实现 POST请求
     */
    public void httpPostNative() throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        ClassicHttpRequest httpPost = ClassicRequestBuilder.post("www.baidu.com").setEntity(new UrlEncodedFormEntity(Arrays.asList(new BasicNameValuePair("username", "vip"), new BasicNameValuePair("password", "secret")))).build();

        try {
            httpclient.execute(httpPost, response -> {
                final HttpEntity entity = response.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity);
                return null;
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            httpclient.close();
        }
    }

}
