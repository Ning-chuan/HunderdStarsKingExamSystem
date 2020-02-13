package domain;

import java.util.Objects;

public class Question {
    private String title;
    private String answer;
    private String picture;

    public Question(){}
    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }
    public Question(String title, String answer,String picture) {
        this.title = title;
        this.answer = answer;
        this.picture = picture;
    }

    public boolean equals(Object o) {
        if(this==o) return true;
        if(o instanceof Question){
            Question otherQuestion  = (Question)o;
            if(this.title .equals(otherQuestion)){
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.title.hashCode();
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
