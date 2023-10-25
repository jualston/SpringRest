package io.RestEx.demo.models;

import java.time.YearMonth;
import java.util.Date;

public class Movie {
    private String title;
    private String description;
    private boolean complete;
    private YearMonth createDate;
    private YearMonth completed;

    public Movie(String title, String description, boolean complete,  YearMonth createDate, YearMonth completed) {
        this.title = title;
        this.description = description;
        this.complete = complete;
        this.createDate = createDate;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public YearMonth getCreateDate() {
        return createDate;
    }

    public void setCreateDate(YearMonth createDate) {
        this.createDate = createDate;
    }

    public YearMonth getCompleted() {
        return completed;
    }

    public void setCompleted(YearMonth completed) {
        this.completed = completed;
    }

//    @Override
//    public String toString(){
//        return title;
//    }
//    @Override
//    public int hashCode(){
//        return title.hashCode();
//
//    }
//    @Override
//    public boolean equals(Object o){
//        if(this==o){
//            return true;
//        }
//        if(o==null || getClass() != o.getClass()){
//            return false;
//        }
//        IdInfo idinfo = (IdInfo) o;
//        return title.equals(idinfo.title);
//    }
}
