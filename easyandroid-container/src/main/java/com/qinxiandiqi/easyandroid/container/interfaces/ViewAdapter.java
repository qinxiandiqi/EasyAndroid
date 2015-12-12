/*
   Copyright 2015 Jianan - qinxiandiqi@foxmail.com

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
package com.qinxiandiqi.easyandroid.container.interfaces;

import android.support.v4.app.Fragment;

/**
 * The adapter interface between presenter and view(fragment).
 * Created by Jianan on 2015/12/7.
 */
public interface ViewAdapter extends DataTransport{

   /**
    * bind the fragment.
    * @param fragment
    */
   void bindFragment(Fragment fragment);

   /**
    * bind the presenter.
    * @param presenter
    */
   void bindPresenter(Presenter presenter);
}
