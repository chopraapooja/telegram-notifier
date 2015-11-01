package com.tw.go.plugin;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by poojar on 02/08/15.
 */
public class HttpsPostSpike {
    public void sendRequest(String message) throws IOException {
        String httpsURL = "https://api.telegram.org/bot113143079:AAEVJy6Z_vPabnOlEyLktuE3DqS3zQZBZcw/sendMessage";

        String query = "text="+URLEncoder.encode("abc@xyz.com","UTF-8");
        query += "&";
        query += "chat_id="+URLEncoder.encode("-22827818","UTF-8") ;

        URL myurl = new URL(httpsURL);
        HttpsURLConnection con = (HttpsURLConnection) myurl.openConnection();
        con.setRequestMethod("POST");

        con.setRequestProperty("Content-length", String.valueOf(query.length()));
        con.setRequestProperty("Content-Type","application/x-www- form-urlencoded");
        con.setDoOutput(true);
        con.setDoInput(true);

        DataOutputStream output = new DataOutputStream(con.getOutputStream());


        output.writeBytes(query);

        output.close();

        DataInputStream input = new DataInputStream( con.getInputStream() );



        for( int c = input.read(); c != -1; c = input.read() )
            System.out.print( (char) c);
        input.close();

        System.out.println("Resp Code:" + con.getResponseCode());
        System.out.println("Resp Message:"+ con .getResponseMessage());
    }

    public static void main(String[] args) throws IOException {
        new HttpsPostSpike().sendRequest("Hi all");
    }
}
