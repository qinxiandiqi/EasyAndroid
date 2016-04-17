/*
   Copyright 2016 Jianan - qinxiandiqi@foxmail.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.qinxiandiqi.easyandroid.js;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Jianan on 2016/04/17.
 */
public class EasyJS {

   private WebViewClient mWebViewClient;
   private WebChromeClient mWebChromeClient;

   public static final EasyJS init(WebView webView) {
      return init(webView, new EasyWebViewClient(), new EasyWebChromeClient());
   }

   public static final EasyJS init(WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient){
      return new EasyJS(webView, webViewClient, webChromeClient);
   }

   private EasyJS(WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient){
      mWebViewClient = webViewClient;
      mWebChromeClient = webChromeClient;
   }
}