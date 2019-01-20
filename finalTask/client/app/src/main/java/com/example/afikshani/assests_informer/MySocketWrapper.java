package com.example.afikshani.assests_informer;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class MySocketWrapper{


    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://10.0.2.2:8080");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }



}
