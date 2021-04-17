package LTM.model;

import java.io.Serializable;

public class Student implements Serializable {
    static final long serialVersionUID = 1L;

    boolean isAlreadyRegistration = false;
    private String maSV;
    private String hovaten;
    private String IP;
    private int group;
    private String rmiName;
    private int rmiPort;
    private String strExamCode1;
    private String strExamCode2;
    private int numericCode3;
    private int numericCode4;
    private int[] numericExam;

    public Student(String maSV, String hovaten, String IP, int group, String rmiName, int rmiPort) {
        this.maSV = maSV;
        this.hovaten = hovaten;
        this.IP = IP;
        this.group = group;
        this.numericExam = new int[5];
        this.rmiName = rmiName;
        this.rmiPort = rmiPort;
    }

    public Student() {
    }

    public Student(int group, String maSV, String hovaten, String iP, String rmiName, int rmiPort) {
        super();
        this.group = group;
        this.maSV = maSV;
        this.hovaten = hovaten;
        IP = iP;
        this.rmiName = rmiName;
        this.rmiPort = rmiPort;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public boolean isAlreadyRegistration() {
        return isAlreadyRegistration;
    }

    public void setAlreadyRegistration(boolean alreadyRegistration) {
        isAlreadyRegistration = alreadyRegistration;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getRmiName() {
        return rmiName;
    }

    public void setRmiName(String rmiName) {
        this.rmiName = rmiName;
    }

    public int getRmiPort() {
        return rmiPort;
    }

    public void setRmiPort(int rmiPort) {
        this.rmiPort = rmiPort;
    }

    public String getStrExamCode1() {
        return strExamCode1;
    }

    public void setStrExamCode1(String strExamCode1) {
        this.strExamCode1 = strExamCode1;
    }

    public String getStrExamCode2() {
        return strExamCode2;
    }

    public void setStrExamCode2(String strExamCode2) {
        this.strExamCode2 = strExamCode2;
    }

    public int getNumericCode3() {
        return numericCode3;
    }

    public void setNumericCode3(int numericCode3) {
        this.numericCode3 = numericCode3;
    }

    public int getNumericCode4() {
        return numericCode4;
    }

    public void setNumericCode4(int numericCode4) {
        this.numericCode4 = numericCode4;
    }

    public int[] getNumericExam() {
        return numericExam;
    }

    public void setNumericExam(int[] numericExam) {
        this.numericExam = numericExam;
    }

    public boolean isIsAlreadyRegistration() {
        return this.isAlreadyRegistration;
    }

}

