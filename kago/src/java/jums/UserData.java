package jums;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

public class UserData implements Serializable{
    private int userID;
    private String name;
    private String pass;
    private String mail;
    private String address;
    private int total;
    private Timestamp newDate;
    private int deleteFlg;
    private int buytotal;
    private int type;
    
    public UserData(){
        this.userID = 0;
        this.name = "";
        this.pass = "";
        this.mail = "";
        this.address= "";
        this.total = 0;
        this.deleteFlg = 0;
        this.buytotal = 0;
        this.type = 0;
    }
    
    public int getUserID(){
        return userID;
    }
    public void setUserID(int userID){
        this.userID=userID;
        }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.trim().length()==0){
            this.name = "";
        }else{
            this.name = name;
        }
    }
    
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        if(pass.trim().length()==0){
            this.pass = "";
        }else{
            this.pass = pass;
        }
    }
    
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        if(mail.trim().length()==0){
            this.mail = "";
        }else{
            this.mail = mail;
        }
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        if(address.trim().length()==0){
            this.address = "";
        }else{
            this.address = address;
        }
    }
    
    public int getTotal(){
        return total;
    }
    public void setTotal(String total){
        if(total.equals("")){
            this.total = 0;
        }else{
            this.total += Integer.parseInt(total);
        }
    }
    
    public Timestamp getNewDate(){
        return newDate;
    }
    public void setNewDate(Timestamp newDate){
        this.newDate = newDate;
    }
    
    public int getDeleteFlg(){
        return deleteFlg;
    }
    public void setDeleteFlg(int deleteFlg){
        this.deleteFlg = deleteFlg;
    }
    
    public int getBuyTotal(){
        return buytotal;
    }
    public void setBuyTotal(String buytotal){
        if(buytotal.equals("")){
            this.buytotal = 0;
        }else{
            this.buytotal = Integer.parseInt(buytotal);
        }
    }
    
    public int getType() {
        return type;
    }
    public void setType(String type) {
        if(type == null){
            this.type = 0;
        }else{
            this.type = Integer.parseInt(type);
        }
    }
    
    public ArrayList<String> chkproperties(){
        ArrayList<String> chkList = new ArrayList<String>();
        if(this.name.equals("")){
            chkList.add("name");
        }
        if(this.pass.equals("")){
            chkList.add("pass");
        }
        if(this.mail.equals("")){
            chkList.add("mail");
        }
        if(this.address.equals("")){
            chkList.add("address");
        }
        
        return chkList;
    }

    public void UD2DTOMapping(UserDataDTO udd){
        udd.setUserID(this.userID);
        udd.setName(this.name);
        udd.setPass(this.pass);
        udd.setMail(this.mail);
        udd.setAddress(this.address);
        udd.setTotal(this.total);
        udd.setNewDate(this.newDate);
        udd.setDeleteFlg(this.deleteFlg);
        udd.setType(this.type);
        udd.setBuytotal(this.buytotal);
    }
    
    public void UD2BeansMapping(UserDataDTO udd){
        this.userID=udd.getUserID();
        this.name=udd.getName();
        this.pass=udd.getPass();
        this.mail=udd.getMail();
        this.address=udd.getAddress();
        this.total=udd.getTotal();
        this.newDate=udd.getNewDate();
        this.setDeleteFlg(udd.getDeleteFlg());
        this.type=udd.getType();
        this.buytotal=udd.getBuytotal();
    }
}