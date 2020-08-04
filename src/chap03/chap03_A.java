package chap03;

import java.util.Comparator;

class chap03_A implements Comparable<chap03_A>{

    public int compareTo(chap03_A c){
        return 0;
    }
    public boolean equals(Object c){
        return true;
    }
}

class X{
    public static final Comparator<chap03_A> COMPARATOR = new Comp();
    private static class Comp implements Comparator<chap03_A>{
        public int compare(chap03_A d1, chap03_A d2){
            return 0;
        }
    }
}
