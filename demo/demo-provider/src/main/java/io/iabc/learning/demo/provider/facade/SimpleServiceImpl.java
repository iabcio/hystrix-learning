 /*
  * Copyright 2017-2018 Iabc Co.Ltd.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *      http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

 package io.iabc.learning.demo.provider.facade;

 import com.alibaba.dubbo.config.annotation.Service;

 import javax.annotation.PostConstruct;

 import io.iabc.learning.demo.share.facade.SimpleService;

 /**
  * Project: hystrix-learning
  * TODO:
  *
  * @author <a href="mailto:h@iabc.io">shuchen</a>
  * @version V1.0
  * @since 2018-09-19 15:32
  */
 @Service(protocol = "dubbo", timeout = 2000)
 public class SimpleServiceImpl implements SimpleService {

     @PostConstruct
     public void init() {
         System.out.println("ohahah");
     }

     @Override
     public String ping() {
         return "pong";
     }

     @Override
     public String echo(String contents) {
         return contents;
     }
 }
