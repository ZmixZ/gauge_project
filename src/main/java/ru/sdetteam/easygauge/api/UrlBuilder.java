package ru.sdetteam.easygauge.api;

import okhttp3.HttpUrl;

import java.net.URL;

public class UrlBuilder {

    private final HttpUrl.Builder builder = new HttpUrl.Builder();

    public UrlBuilder(){

        builder.scheme("http")
                .host("192.168.0.33")
                .addPathSegments("api/rest");
    }

    public UrlBuilder addPathSegment(String segment){

        builder.addPathSegments(segment);
        return this;
    }

    public UrlBuilder addParameter(String key, String value){

        builder.addQueryParameter(key, value);
        return this;
    }

    public URL buildUrl(){

        return builder.build().url();
    }
}
