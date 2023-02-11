package 员工系统;

import javax.swing.*;

public class job {
    private String jid;

    private String jname;
    public job(){

    }
    public job(String jid, String jname) {
        this.jid = jid;
        this.jname = jname;
    }

    public String getJid() {
        return jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
}
