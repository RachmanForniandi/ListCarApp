package id.co.listcarapp.models;

public class Car {

    private String Logo;
    private String Model;
    private String nameOwner;
    private String contactNo;


    public Car(String logo, String model, String nameOwner, String contactNo) {
        Logo = logo;
        Model = model;
        this.nameOwner = nameOwner;
        this.contactNo = contactNo;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
