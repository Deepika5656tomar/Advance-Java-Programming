import java.util.*;

class Student2 implements Comparable<Student2>{
    int sid;
    String sName;
    
    public Student2(int sid, String sName){
        super();
        this.sid=sid;
        this.sName=sName;
    }
    @override
    public int compareTo(Student2 ob){
        if(sid==ob.sid){
            return 0;
        }else if(sid>ob.sid){
            return 1;
        }else{
            return -1;
        }
    }
}


public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student2> a1= new ArrayList<Student2>();
        a1.add(new Student2(101,"Aanya"));
        a1.add(new Student2(105,"Aastha"));
        a1.add(new Student2(104,"Divy"));
        a1.add(new Student2(102,"Abhi"));
        Collections.sort(a1);
        for(Student2 s:a1){
            System.out.println(s.sid+" "+ s.sName);
        }
    }
}
