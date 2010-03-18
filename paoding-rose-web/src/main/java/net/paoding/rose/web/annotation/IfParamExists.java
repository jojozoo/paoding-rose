/*
 * Copyright 2007-2009 the original author or authors.
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
package net.paoding.rose.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 将 {@link IfParamExists} 标注在控制器方法的参数上，用于表示只有符合此条件时，才将请求映射到该方法。
 * 
 * 
 * @author 王志亮 [qieqie.wang@gmail.com]
 * 
 */
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IfParamExists {

    /**
     * 示例：<br>
     * 
     * IfParamExists("type")表示只当请求含有非零长度的type参数时才映射到此类 <br>
     * IfParamExists("type=1" ) 表示只当请求含有tyep参数且值为1才映射到此方法 ；<br>
     * 
     * @return
     */
    String[] value();
}