package practise.http;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Http {
    public static void main(String args[]) throws Exception
    {

        MultipartEntity multipartEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE, "------------------------------0ea3fcae38ff", Charset
                .defaultCharset());
        multipartEntity.addPart("file", new FileBody(new File("/Users/juntao/Desktop/ncmm.jpg")));
        multipartEntity.addPart("imtype", new StringBody("raw"));
        multipartEntity.addPart("transactionCode", new StringBody("123"));



        HttpPost request = new HttpPost("http://deepblue.natapp1.cc/consumer-service/biology/recognize");
        request.setEntity(multipartEntity);

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(request);

        InputStream is = response.getEntity().getContent();
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null)
        {
            buffer.append(line);
        }

        System.out.println("发送消息收到的返回：" + buffer.toString());
    }
}
