package SocketLTM.model;

import java.io.Serializable;

public class Answer implements Serializable {
    private static final long serialVersionUID = 2L;
    private Student student;
    private Object[] answers;
    private boolean[] isRights;
    private boolean alreadyRegistration;

    public Answer(Student student, Object[] answers, boolean[] isRights, boolean alreadyRegistration) {
        this.student = student;
        this.answers = answers;
        this.isRights = isRights;
        this.alreadyRegistration = alreadyRegistration;
    }

    public Answer() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Object[] getAnswers() {
        return answers;
    }

    public void setAnswers(Object[] answers) {
        this.answers = answers;
    }

    public boolean[] getIsRights() {
        return isRights;
    }

    public void setIsRights(boolean[] isRights) {
        this.isRights = isRights;
    }

    public boolean isAlreadyRegistration() {
        return alreadyRegistration;
    }

    public void setAlreadyRegistration(boolean alreadyRegistration) {
        this.alreadyRegistration = alreadyRegistration;
    }
}
