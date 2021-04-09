/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.entity;

/**
 *
 * @author dell
 */
public class Airlines {
    int airlines_id;
    String airlines_name,airlines_phone,airlines_address;

    public Airlines() {
    }

    public Airlines(int airlines_id, String airlines_name, String airlines_phone, String airlines_address) {
        this.airlines_id = airlines_id;
        this.airlines_name = airlines_name;
        this.airlines_phone = airlines_phone;
        this.airlines_address = airlines_address;
    }

    public Airlines(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Airlines(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAirlines_id() {
        return airlines_id;
    }

    public void setAirlines_id(int airlines_id) {
        this.airlines_id = airlines_id;
    }

    public String getAirlines_name() {
        return airlines_name;
    }

    public void setAirlines_name(String airlines_name) {
        this.airlines_name = airlines_name;
    }

    public String getAirlines_phone() {
        return airlines_phone;
    }

    public void setAirlines_phone(String airlines_phone) {
        this.airlines_phone = airlines_phone;
    }

    public String getAirlines_address() {
        return airlines_address;
    }

    public void setAirlines_address(String airlines_address) {
        this.airlines_address = airlines_address;
    }
    
    
    
}
