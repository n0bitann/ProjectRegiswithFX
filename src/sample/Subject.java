package sample;

import java.util.ArrayList;

public class Subject {
    String[][] subjectList = new String[75][4];
    ArrayList<String> subjectAlreadyAdd = new ArrayList<>();


    //[][2]=1  ลงแล้ว
    //[][3] วิชาที่ต้องลงก่อน
    public void setAllSubject() {
        subjectList[0][0] = "01418111";
        subjectList[0][1] = "Computer Applications";
        subjectList[1][0] = "01418112";
        subjectList[1][1] = "Introduction to Computer";
        subjectList[2][0] = "01418113";
        subjectList[2][1] = "Computer and Information Technology";
        subjectList[3][0] = "01418114";
        subjectList[3][1] = "Introduction to Computer Science";
        subjectList[4][0] = "01418115";
        subjectList[4][1] = "Structured Programming";
        subjectList[5][0] = "01418116";
        subjectList[5][1] = "Computer Programming";
        subjectList[6][0] = "01418131";
        subjectList[6][1] = "Digital Computer Logic";
        subjectList[7][0] = "01418132";
        subjectList[7][1] = "Fundamentals of Computing";
        subjectList[8][0] = "01418211";
        subjectList[8][1] = "Visual Programming";
        subjectList[8][3] = "01418112 or 01418114";
        subjectList[9][0] = "01418212";
        subjectList[9][1] = "FORTRAN Programming";
        subjectList[9][3] = "01418112 or 01418114";
        subjectList[10][0] = "01418213";
        subjectList[10][1] = "COBOL Programming";
        subjectList[10][3] = "01418112 or 01418114";
        subjectList[11][0] = "01418214";
        subjectList[11][1] = "C Programming";
        subjectList[11][3] = "01418112 or 01418114";
        subjectList[12][0] = "01418215";
        subjectList[12][1] = "Object Oriented Programming";
        subjectList[12][3] = "01418112 or 01418114";
        subjectList[13][0] = "01418216";
        subjectList[13][1] = "Principles of Programming Languages";
        subjectList[13][3] = "01418116";
        subjectList[14][0] = "01418217";
        subjectList[14][1] = "Software Construction";
        subjectList[14][3] = "01418116";
        subjectList[15][0] = "01418218";
        subjectList[15][1] = "LISP Programming";
        subjectList[15][3] = "01418112 or 01418114";
        subjectList[16][0] = "01418219";
        subjectList[16][1] = "Prolog Programming";
        subjectList[16][3] = "01418112 or 01418114";
        subjectList[17][0] = "01418221";
        subjectList[17][1] = "Fundamentals of Database Systems";
        subjectList[17][3] = "01418116";
        subjectList[18][0] = "01418222";
        subjectList[18][1] = "Internet Application for Commerce";
        subjectList[18][3] = "01418112 or 01418114";
        subjectList[19][0] = "01418231";
        subjectList[19][1] = "Data Structures";
        subjectList[19][3] = "01418116";
        subjectList[20][0] = "01418232";
        subjectList[20][1] = "Algorithm Design and Analysis";
        subjectList[20][3] = "01418231";
        subjectList[21][0] = "01418233";
        subjectList[21][1] = "Unix Operating System and Shell Programming";
        subjectList[21][3] = "01418112 or 01418114";
        subjectList[22][0] = "01418321";
        subjectList[22][1] = "System Analysis and Design";
        subjectList[22][3] = "01418221";
        subjectList[23][0] = "01418322";
        subjectList[23][1] = "Principles of Information System";
        subjectList[23][3] = "01418112 or 01418114";
        subjectList[24][0] = "01418323";
        subjectList[24][1] = "Electronic Commerce Design and Development";
        subjectList[24][3] = "01418116";
        subjectList[25][0] = "01418324";
        subjectList[25][1] = "Data Visualization";
        subjectList[25][3] = "01418116";
        subjectList[26][0] = "01418325";
        subjectList[26][1] = "Information Quality Management";
        subjectList[26][3] = "01418221 or 01418222 or 01418322";
        subjectList[27][0] = "01418326";
        subjectList[27][1] = "Database Management System Architecture";
        subjectList[27][3] = "01418221";
        subjectList[28][0] = "01418327";
        subjectList[28][1] = "Multimedia Database";
        subjectList[28][3] = "01418221";
        subjectList[29][0] = "01418328";
        subjectList[29][1] = "Decision Support and Business Intelligent Systems";
        subjectList[30][0] = "01418331";
        subjectList[30][1] = "Assembly Language and Computer Architecture";
        subjectList[30][3] = "01418116 or 01418131 or 01420243";
        subjectList[31][0] = "01418332";
        subjectList[31][1] = "Operating Systems";
        subjectList[31][3] = "01418331";
        subjectList[32][0] = "01418333";
        subjectList[32][1] = "Formal Language and Automata Theory";
        subjectList[32][3] = "01418132 or 01417271";
        subjectList[33][0] = "01418334";
        subjectList[33][1] = "Compiler Techniques";
        subjectList[33][3] = "01418216";
        subjectList[34][0] = "01418335";
        subjectList[34][1] = "Data Compression";
        subjectList[34][3] = "01418231";
        subjectList[35][0] = "01418341";
        subjectList[35][1] = "Computer Application in Linear Optimization and Network Analysis";
        subjectList[35][3] = "01417322 and 01418116"; ////and
        subjectList[36][0] = "01418342";
        subjectList[36][1] = "Web Application Programming";
        subjectList[36][3] = "01418116 and 01418221";//and
        subjectList[37][0] = "01418343";
        subjectList[37][1] = "Intellectual Property for Software and Digital Contents";
        subjectList[38][0] = "01418344";
        subjectList[38][1] = "Enterprise Resource Planning System Design and Development";
        subjectList[38][3] = "01418221";
        subjectList[39][0] = "01418345";
        subjectList[39][1] = "Computer Programming in Business";
        subjectList[39][3] = "01418115 or 01418116 or 01418211 or 01418212 or 01418213 or 01418214 or 01418215";
        subjectList[40][0] = "01418346";
        subjectList[40][1] = "Mobile Application Design and Development";
        subjectList[40][3] = "01418116 and 01418221"; ///and
        subjectList[41][0] = "01418351";
        subjectList[41][1] = "Computer Communications and Protocols";
        subjectList[41][3] = "01418116";
        subjectList[42][0] = "01418352";
        subjectList[42][1] = "Data Communications and Networks";
        subjectList[42][3] = "01418351";
        subjectList[43][0] = "01418353";
        subjectList[43][1] = "Computer System and Communication Network Security";
        subjectList[43][3] = "01418351";
        subjectList[44][0] = "01418381";
        subjectList[44][1] = "Principles of Computer Animation";
        subjectList[44][3] = "01418112 or 01418114";
        subjectList[45][0] = "01418382";
        subjectList[45][1] = "Computer Graphics Working Environment";
        subjectList[45][3] = "01418116";
        subjectList[46][0] = "01418383";
        subjectList[46][1] = "Game Programming";
        subjectList[46][3] = "01418116";
        subjectList[47][0] = "01418384";
        subjectList[47][1] = "Image Analysis and Computer Vision";
        subjectList[47][3] = "01418231 and 01422111";  ////and
        subjectList[48][0] = "01418385";
        subjectList[48][1] = "Digital Image Processing";
        subjectList[48][3] = "01418116";
        subjectList[49][0] = "01418390";
        subjectList[49][1] = "Cooperative Education Preparation";
        subjectList[49][3] = "01418321";
        subjectList[50][0] = "01418399";
        subjectList[50][1] = "Computer Science Project Preparation";
        subjectList[50][3] = "01418321";
        subjectList[51][0] = "01418401";
        subjectList[51][1] = "Computer and Society";
        subjectList[52][0] = "01418421";
        subjectList[52][1] = "Human Computer Interaction";
        subjectList[52][3] = "01418116 or 01418322";
        subjectList[53][0] = "01418431";
        subjectList[53][1] = "Introduction to Embedded Systems";
        subjectList[53][3] = "01418115 or 01418214";
        subjectList[54][0] = "01418441";
        subjectList[54][1] = "Simulation and Modeling";
        subjectList[54][3] = "01418115 or 01418116 or 01418211 or 01418214 or 01418215 and 01422111";  ///and or
        subjectList[55][0] = "01418442";
        subjectList[55][1] = "Business Data Dimension and Report Management";
        subjectList[55][3] = "01418344 or 01418345";
        subjectList[56][0] = "01418443";
        subjectList[56][1] = "Web Technology and Web Services";
        subjectList[56][3] = "01418351";
        subjectList[57][0] = "01418444";
        subjectList[57][1] = "Numerical Method Programming";
        subjectList[57][3] = "01418115 or 01418116 or 01418214 or 01418215 and 01417322";  ///and or
        subjectList[58][0] = "01418451";
        subjectList[58][1] = "Network Design and Administration";
        subjectList[58][3] = "01418351";
        subjectList[59][0] = "01418461";
        subjectList[59][1] = "Information Retrieval System";
        subjectList[59][3] = "01418232";
        subjectList[60][0] = "01418462";
        subjectList[60][1] = "Theory of Artificial Intelligence";
        subjectList[60][3] = "01418232";
        subjectList[61][0] = "01418463";
        subjectList[61][1] = "Statistical Natural Language Processing";
        subjectList[61][3] = "01417271 or 01418132 and 01418116 ";  //and or
        subjectList[62][0] = "01418471";
        subjectList[62][1] = "Introduction to Software Engineering";
        subjectList[62][3] = "01418221";
        subjectList[63][0] = "01418472";
        subjectList[63][1] = "Project Management and Control";
        subjectList[63][3] = "01418221";
        subjectList[64][0] = "01418473";
        subjectList[64][1] = "Computer Control and Audit";
        subjectList[64][3] = "01418321";
        subjectList[65][0] = "01418474";
        subjectList[65][1] = "Computer Performance and Evaluation";
        subjectList[65][3] = "01418332";
        subjectList[66][0] = "01418475";
        subjectList[66][1] = "Software Quality Management";
        subjectList[66][3] = "01418321";
        subjectList[67][0] = "01418476";
        subjectList[67][1] = "Software Testing and Verification";
        subjectList[67][3] = "01418217";
        subjectList[68][0] = "01418477";
        subjectList[68][1] = "Software Measurement";
        subjectList[68][3] = "01418321";
        subjectList[69][0] = "01418481";
        subjectList[69][1] = "Multi-Character Animation";
        subjectList[69][3] = "01418112 or 01418114";
        subjectList[70][0] = "01418482";
        subjectList[70][1] = "Computer Graphics";
        subjectList[70][3] = "01418116";
        subjectList[71][0] = "01418490";
        subjectList[71][1] = "Cooperative Education";
        subjectList[71][3] = "01418390";
        subjectList[72][0] = "01418496";
        subjectList[72][1] = "Selected Topic in Computer Science";
        subjectList[73][0] = "01418497";
        subjectList[73][1] = "Seminar";
        subjectList[73][3] = "01418216 or 01418221 or 01418232";
        subjectList[74][0] = "01418499";
        subjectList[74][1] = "Computer Science Project";
        subjectList[74][3] = "01418399";
    }

    //add subject
    public boolean setSubjectList(String input) {
        boolean isFound = false;
        for (int i = 0; i < subjectList.length; i++) {
            if (input.equals(subjectList[i][0]) && checkSubjectBeforeAdd(input)) {
                isFound = true;
                subjectList[i][2] = "1";
                subjectAlreadyAdd.add(input);
                subjectAlreadyAdd.add(subjectList[i][3]);
            }
        }
        return isFound;
    }

    //check is duplicate subject?
    public boolean alreadyInArray(String input) {
        boolean isHave = false;
        for (int i = 0; i < subjectList.length; i++) {
            if (subjectList[i][2] == "1" && input.equals(subjectList[i][0])) {
                isHave = true;
            }
        }
        return isHave;
    }

    public boolean checkSubjectBeforeAdd(String input) {
        boolean canAdd = false;
        for (int i = 0; i < subjectList.length; i++) {
            System.out.println(subjectAlreadyAdd);
            if (subjectList[i][0].equals(input)){
                if (subjectList[i][0].contains(subjectList[i][3])&&subjectList[i][2]=="1") {
                    System.out.println("in");
                    canAdd = true;
            }
            } else {
                System.out.println("out");
            }
        }

        return canAdd;
    }

}
