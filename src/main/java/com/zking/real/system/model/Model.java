package com.zking.real.system.model;

import lombok.ToString;

@ToString
public class Model {
    private String rCode;

    private String rParentCode;

    private String rIcon;

    private String rText;

    private String rUrl;

    public Model(String rCode, String rParentCode, String rIcon, String rText, String rUrl) {
        this.rCode = rCode;
        this.rParentCode = rParentCode;
        this.rIcon = rIcon;
        this.rText = rText;
        this.rUrl = rUrl;
    }

    public Model() {
        super();
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public String getrParentCode() {
        return rParentCode;
    }

    public void setrParentCode(String rParentCode) {
        this.rParentCode = rParentCode;
    }

    public String getrIcon() {
        return rIcon;
    }

    public void setrIcon(String rIcon) {
        this.rIcon = rIcon;
    }

    public String getrText() {
        return rText;
    }

    public void setrText(String rText) {
        this.rText = rText;
    }

    public String getrUrl() {
        return rUrl;
    }

    public void setrUrl(String rUrl) {
        this.rUrl = rUrl;
    }
}