package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zr162 on 3/21/17.
 */
public class Shuffle {
    public void shuffle(ArrayList a){
        String
        for (int i=0;i<a.size();i++){

        }
    }
    public void Shuffle(String a[]){
        int rndm=new Random().nextInt(a.length/2);
        String b[]=new String[rndm];
        String c[]=new String [a.length-rndm];
        System.arraycopy(a,0,b,0,rndm);
        System.arraycopy(a,rndm,c,0,a.length-rndm);


    }
    public  ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b){

        if(b.size()>a.size())
            return merge(b,a);
        int l1=a.size();
        int l2=b.size();
        ArrayList<String> c=new ArrayList<String>();
        for (int i=0;i<l1+l2;i++){
            if (i%(i/b.size())==0){

                c.add(b.get(0));

            }
        }
    }
}
