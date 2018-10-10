package sample;

import java.util.ArrayList;

public class SubjectTest {
    private String id;
    private String subjectName;
    private int alreadyAdd = 0;
    private String previousSubject;
    ArrayList<String> subjectList = new ArrayList<String>();
    Subject subject = new Subject();
    SubjectTest introCom = new SubjectTest("01418114","Introduction to Computer Science","");
    SubjectTest digital = new SubjectTest("01418131","Digital Computer Logic","");
    SubjectTest comPro = new SubjectTest("01418116","Computer Programming","01418114");
    SubjectTest softCon = new SubjectTest("01418217","Software Construction","01418116");
    SubjectTest dataStruc = new SubjectTest("01418231","Data Structures","01418116");
    SubjectTest fundCom = new SubjectTest("01418132","Fundamentals of Computing","01418116");
    SubjectTest ppl = new SubjectTest("01418216","Principles of Programming Languages","01418116");
    SubjectTest db = new SubjectTest("01418221","Fundamentals of Database Systems","01418116");
    SubjectTest algo = new SubjectTest("01418232","Algorithm Design and Analysis","01418231");
    SubjectTest sa = new SubjectTest("01418321","System Analysis and Design","01418221");
    SubjectTest network = new SubjectTest("01418351","Computer Communications and Protocols","01418116");
    SubjectTest assembly = new SubjectTest("01418331","Assembly Language and Computer Architecture","01418116,01418131");
    SubjectTest preCoop = new SubjectTest("01418399","Computer Science Project Preparation","01418321");
    SubjectTest os = new SubjectTest("01418332","Operating Systems","01418331");
    SubjectTest auto = new SubjectTest("01418333","Formal Language and Automata Theory","01418132");
    SubjectTest ip = new SubjectTest("01418343","Intellectual Property for Software and Digital Contents","");
    SubjectTest seminar = new SubjectTest("01418497","Seminar","01418216,01418221,01418232");
    SubjectTest coop = new SubjectTest("01418499","Computer Science Project","01418399");
    SubjectTest preProject = new SubjectTest("01418390","Cooperative Education Preparation","01418321");
    SubjectTest project = new SubjectTest("01418490","Computer Science Project","01418390");

    public SubjectTest(String id, String subjectName, String previousSubject) {
        this.id = id;
        this.subjectName = subjectName;
        this.previousSubject = previousSubject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getAlreadyAdd() {
        return alreadyAdd;
    }

    public void setAlreadyAdd(int alreadyAdd) {
        this.alreadyAdd = alreadyAdd;
    }

    public void addSubject(String subject) {
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i) != subject && checkPreviousSubject()) {
                subjectList.add(subjectName);
                setAlreadyAdd(1);
            } else {
                System.out.println("no");
            }
        }
    }

    public boolean checkPreviousSubject() {
        boolean preSubject = false;
        if (getAlreadyAdd() == 1) {
            preSubject = true;
        }
        return preSubject;
    }


}
