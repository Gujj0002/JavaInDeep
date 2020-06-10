package com.company;

public class Main {

    public static void main(String[] args) {



        /* types of some string methods.....*/

        String[] str = {"hello", "Alps","olalo","patric"};
        for (String W: str){
            if (W.startsWith("he")){
                System.out.println(W + " starts with he.");
            }
            if (W.endsWith("lo")){
                System.out.println(W + " starts with lo.");
            }
        }

        String s = "alpespatricaplspatric";
        System.out.println(s.indexOf('p', 7));
        System.out.println(s.indexOf("pes"));

        String a = "Alps ";
        String b = "     Gujjar         ";

        System.out.println(a.concat(b));
        System.out.println(a.replace('A', 'C'));
        System.out.println(b.trim());

    }
}
