package com.example.demo.Model;


import javax.persistence.*;

@Entity
public class booleann {
    @Id
    private String message;

    public booleann() {
    }

    public booleann(String message, com.example.demo.Model.rollback rollback) {
        this.message = message;
        this.rollback = rollback;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public com.example.demo.Model.rollback getRollback() {
        return rollback;
    }

    public void setRollback(com.example.demo.Model.rollback rollback) {
        this.rollback = rollback;
    }

    @Enumerated(EnumType.ORDINAL)
    private rollback rollback;

}
