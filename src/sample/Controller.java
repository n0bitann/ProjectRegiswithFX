package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller {
    @FXML
    TextField subjectInput;
    @FXML
    Button enterButton;
    @FXML
    Button cancelButton;
    @FXML
    Label statusLabel;
    @FXML
    Label line1;
    @FXML
    Label line2;
    Subject subject = new Subject();

//    SubjectTest introCom = new SubjectTest("01418114","Introduction to Computer Science","");
//    SubjectTest digital = new SubjectTest("01418131","Digital Computer Logic","");
//    SubjectTest comPro = new SubjectTest("01418116","Computer Programming","01418114");
//    SubjectTest softCon = new SubjectTest("01418217","Software Construction","01418116");
//    SubjectTest dataStruc = new SubjectTest("01418231","Data Structures","01418116");
//    SubjectTest fundCom = new SubjectTest("01418132","Fundamentals of Computing","01418116");
//    SubjectTest ppl = new SubjectTest("01418216","Principles of Programming Languages","01418116");
//    SubjectTest db = new SubjectTest("01418221","Fundamentals of Database Systems","01418116");
//    SubjectTest algo = new SubjectTest("01418232","Algorithm Design and Analysis","01418231");
//    SubjectTest sa = new SubjectTest("01418321","System Analysis and Design","01418221");
//    SubjectTest network = new SubjectTest("01418351","Computer Communications and Protocols","01418116");
//    SubjectTest assembly = new SubjectTest("01418331","Assembly Language and Computer Architecture","01418116,01418131");
//    SubjectTest preCoop = new SubjectTest("01418399","Computer Science Project Preparation","01418321");
//    SubjectTest os = new SubjectTest("01418332","Operating Systems","01418331");
//    SubjectTest auto = new SubjectTest("01418333","Formal Language and Automata Theory","01418132");
//    SubjectTest ip = new SubjectTest("01418343","Intellectual Property for Software and Digital Contents","");
//    SubjectTest seminar = new SubjectTest("01418497","Seminar","01418216,01418221,01418232");
//    SubjectTest coop = new SubjectTest("01418499","Computer Science Project","01418399");
//    SubjectTest preProject = new SubjectTest("01418390","Cooperative Education Preparation","01418321");
//    SubjectTest project = new SubjectTest("01418490","Computer Science Project","01418390");


    @FXML
    public void initialize() {
        statusLabel.setText("Input your subject");
        subject.setAllSubject();
        line1.setVisible(false);
        line2.setVisible(false);
    }


    @FXML
    public void handleEnterButtonClick(ActionEvent actionEvent) {
        String input = subjectInput.getText();
//        if (subject.alreadyInArray(input)) {
//            statusLabel.setText(input + " Already have");
//            subjectInput.setText("");
//        } else {
//            if (subject.setSubjectList(input)) {
//                statusLabel.setText(input + " is added");
//                subjectInput.setText("");
//                line1.setVisible(true);
//                line1.setText(input);
//            } else {
//                statusLabel.setText("Not found");
//                subjectInput.setText("");
//            }
//        }
        subjectInput.setText("");
    }


    @FXML
    public void handleCancelButtonClick(ActionEvent actionEvent) {
        subjectInput.setText("");
    }


}





