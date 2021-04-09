/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.entity;

import java.sql.Date;

/**
 *
 * @author dell
 */
public class Bill {
    int bill_no,customer_no,airlines_no,pax_no,staff_id;
    String flight_no, sector;
    String flight_date;
     Date date;
    float cost;
    int cancel;
    

    public Bill() {
    }

    public Bill(int aInt, int aInt0, String string, String string0, Date date, int aInt1, float aFloat, int aInt2, Date date0, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Bill(int bill_no, int customer_no, int airlines_no, int pax_no, int staff_id, String flight_no, String sector, String flight_date, Date date, float cost, int cancel) {
        this.bill_no = bill_no;
        this.customer_no = customer_no;
        this.airlines_no = airlines_no;
        this.pax_no = pax_no;
        this.staff_id = staff_id;
        this.flight_no = flight_no;
        this.sector = sector;
        this.flight_date = flight_date;
        this.date = date;
        this.cost = cost;
        this.cancel = cancel;
    }

   

    

    

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public int getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(int customer_no) {
        this.customer_no = customer_no;
    }

    public int getAirlines_no() {
        return airlines_no;
    }

    public void setAirlines_no(int airlines_no) {
        this.airlines_no = airlines_no;
    }

    public int getPax_no() {
        return pax_no;
    }

    public void setPax_no(int pax_no) {
        this.pax_no = pax_no;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCancel() {
        return cancel;
    }

    public void setCancel(int cancel) {
        this.cancel = cancel;
    }

   
    
    
    
    
}
