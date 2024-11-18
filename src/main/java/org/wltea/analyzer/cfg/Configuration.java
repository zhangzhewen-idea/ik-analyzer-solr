/*
 * IK 中文分词  版本 8.5.0
 * IK Analyzer release 8.5.0
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 源代码由林良益(linliangyi2005@gmail.com)提供
 * 版权声明 2012，乌龙茶工作室
 * provided by Linliangyi and copyright 2012 by Oolong studio
 *
 * 8.5.0版本 由 Magese (magese@live.cn) 更新
 * release 8.5.0 update by Magese(magese@live.cn)
 *
 */
package org.wltea.analyzer.cfg;

import java.util.List;

/**
 * 配置管理类接口
 */
public interface Configuration {


    /**
     * 返回useSmart标志位
     * useSmart =true ，分词器使用智能切分策略， =false则使用细粒度切分
     *
     * @return useSmart
     */
    boolean useSmart();

    /**
     * 设置useSmart标志位
     *
     * @param useSmart =true ，分词器使用智能切分策略， =false则使用细粒度切分
     */
    void setUseSmart(boolean useSmart);

    /**
     * 获取是否使用主词典
     *
     * @return = true 默认加载主词典， = false 不加载主词典
     */
    boolean useMainDict();

    /**
     * 设置是否使用主词典
     *
     * @param useMainDic = true 默认加载主词典， = false 不加载主词典
     */
    void setUseMainDict(boolean useMainDic);

    /**
     * 获取主词典路径
     *
     * @return String 主词典路径
     */
    String getMainDictionary();

    /**
     * 获取量词词典路径
     *
     * @return String 量词词典路径
     */
    String getQuantifierDictionary();

    /**
     * 获取扩展字典配置路径
     *
     * @return 相对类加载器的路径
     */
    List<String> getExtDictionarys();


    /**
     * 获取扩展停止词典配置路径
     *
     * @return 相对类加载器的路径
     */
    List<String> getExtStopWordDictionarys();


    /**
     * 获取扩展词库数据
     *
     * @return 词库数据
     */
    List<String> getExtDictionaryData();


    /**
     * 获取IK子分词器的class全称，用于注册IK子分词器
     *
     * @return IK子分词器的class全称列表
     */
    List<String> getSegmenterClassNames();
}
