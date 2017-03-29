package com.txw.splider.vo;


import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tangxiewen on 2017/3/22.
 */
public class LinkQueue {
    //已访问的url集合
    private static Set visitedUrl = new HashSet();
    //待访问的url集合
    private static Queue unVisitedUrl = new Queue();

    //获取URL队列
    public static Queue getUnVisitedUrl(){
        return unVisitedUrl;
    }
    //添加到访问过的URL队列中
    public static void addVisistedUrl(String url){
        visitedUrl.add(url);
    }
    //移除访问过的URL
    public static void removeVisitedUrl(String url){
        visitedUrl.remove(url);
    }
    //未访问的url出队列
    public static Object unVisistedUrlDeQueue(){
        return unVisitedUrl.deQueue();
    }

    public static void addUnVisitedUrl(String url){
        if(StringUtils.isNotBlank(url)
                && !visitedUrl.contains(url)
                && !unVisitedUrl.contain(url)){
           unVisitedUrl.enQueue(url);
        }
    }

    public static int getVisitedUrlNum(){
        return visitedUrl.size();
    }

    public static boolean unVisitedUrlsEmpty(){
        return unVisitedUrl.isQueueEmpty();
    }
}
