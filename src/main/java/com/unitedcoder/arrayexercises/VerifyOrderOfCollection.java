package com.unitedcoder.arrayexercises;

import org.apache.hc.core5.http.io.SessionOutputBuffer;

import java.util.*;

public class VerifyOrderOfCollection {
    public static void main(String[] args) {
        List<String> phoeList=new ArrayList<>() ;
        phoeList.add("Alma");
        phoeList.add("huawei");
        phoeList.add("xiaomi");
        phoeList.add("sumsong");
        phoeList.add("htc");
        phoeList.add("nokia");
        phoeList.add("iphone");
        phoeList.add("motorella");
        System.out.println(phoeList);

        List<String> copiedList=new ArrayList<>();
        copiedList.addAll(phoeList);
        Collections.sort(copiedList);

        System.out.println(copiedList);
        boolean isSorted=phoeList.equals(copiedList);
        if(isSorted){
            System.out.println("phone list are sorted correctly");
        }
          else{
            System.out.println("phone list are not sorted");
        }

    }
}
