package com.zking.real.system.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Compay  implements Serializable{
    private String rComid;

    private String rComname;

    private String rNote;

    public Compay(String rComid, String rComname, String rNote) {
        this.rComid = rComid;
        this.rComname = rComname;
        this.rNote = rNote;
    }

    public Compay() {
        super();
    }

    public String getrComid() {
        return rComid;
    }

    public void setrComid(String rComid) {
        this.rComid = rComid;
    }

    public String getrComname() {
        return rComname;
    }

    public void setrComname(String rComname) {
        this.rComname = rComname;
    }

    public String getrNote() {
        return rNote;
    }

    public void setrNote(String rNote) {
        this.rNote = rNote;
    }
}