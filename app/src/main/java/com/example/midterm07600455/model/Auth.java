package com.example.midterm07600455.model;

public class Auth {
    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    private static final String EMAILteacher = "bbb";
    private static final String PASSWORDteacher = "222";

    private String mEmail ;
    private String mPassword;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }

    public void setmEmail(String email) {
        this.mEmail = email;
    }

    /*public String getmPassword() {
        return mPassword;
    }*/

    public void setmPassword(String password) {
        this.mPassword = password;
    }

    public boolean check(){
        if(mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)){
            return true;
        }else{
            return false;
        }
    }
}
