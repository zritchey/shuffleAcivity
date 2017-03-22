package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**https://github.com/zritchey/shuffleAcivity.git
 * Created by zr162 on 3/21/17.
 */
public class Shuffle {

    private ArrayList<String> group;
    public Shuffle(){
        group=new ArrayList();
    }
    public void FileRead(String path){
        try{
            Scanner sc=new Scanner(new File(path));
            while (sc.hasNextLine()){
                group.add(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException ioe){

        }

    }
    public void Shuffle(){
        Shuffle(group);
    }
    public void Shuffle(ArrayList<String> a){
        for(int j=0;j<20;j++) {
            int rndm = new Random().nextInt(a.size() / 2);
            if (rndm==0)
                rndm++;
            ArrayList<String> b = new ArrayList();
            ArrayList<String> c = new ArrayList<>();
            for (int i = 0; i < rndm; i++)
                b.add(a.get(i));
            for (int i = rndm; i < a.size(); i++)
                c.add(a.get(i));
            b = merge(c, b);

            for (int i = 0; i < b.size(); i++) {
                a.set(i, b.get(i));
            }
        }

    }
    public void print(){
        System.out.println(Arrays.toString(group.toArray()));
        for (int i=0;i<group.size();i++){

        }
    }
    public  ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b){
        if(b.size()>a.size())
            return merge(b,a);
        int l1=a.size();
        int l2=b.size();
        ArrayList<String> c=new ArrayList<String>();
        boolean pass=false;
        for (int i=0;i<l1+l2;i++){

            if (i%(l1/l2)==0&&!pass&&b.size()!=0){
                pass=true;
                c.add(b.remove(0));
            }
            else if(b.size()!=0 ){
                pass=false;
                c.add(a.remove(0));
            }
            else {
                l2=a.size();
                for (int j=0;j<l2;j++){
                    c.add(j,a.remove(0));
                }
                break;
            }
        }
        return c;
    }
    public ArrayList<String> shuffleFile(String path){
        group.clear();
        FileRead(path);
        Shuffle(group);
        return group;
    }
}
