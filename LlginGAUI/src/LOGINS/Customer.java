/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGINS;


 
public class Customer {
 private String cCustomerID;
  private String FirstName;
   private String SurName; 
    private String Address;
     private String Postcode;
      private String Town;
       private String Proveofid;
       private double Deposit;
       private double DownPayment;   

    public String getcCustomerID() {
        return cCustomerID;
    }

    public void setcCustomerID(String cCustomerID) {
        this.cCustomerID = cCustomerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProveofid() {
        return Proveofid;
    }

    public void setProveofid(String Proveofid) {
        this.Proveofid = Proveofid;
    }

    public double getDeposit() {
        return Deposit;
    }

    public void setDeposit(double Deposit) {
        this.Deposit = Deposit;
    }

    public double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(double DownPayment) {
        this.DownPayment = DownPayment;
    }
 
}
