package KTVTKPM.Observer;

import java.util.Date;

public class Customer implements CustomerObserver {
    private int id;
    private String phoneNumber;
    private String email;
    private Date birthday;
    private int idFullName;
    private int idAddress;

    public Customer(int id, String phoneNumber, String email, Date birthday, int idFullName, int idAddress) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.idFullName = idFullName;
        this.idAddress = idAddress;
    }

    public Customer(int id, String phoneNumber, String email, int idFullName, int idAddress) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idFullName = idFullName;
        this.idAddress = idAddress;
    }

    public Customer(String phoneNumber, String email, Date birthday, int idFullName, int idAddress) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.idFullName = idFullName;
        this.idAddress = idAddress;
    }

    @Override
    public void getPromotioNotify(String message) {
        // get messages about the promotions
        System.out.println("Customer with id = " + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getIdFullName() {
        return idFullName;
    }

    public void setIdFullName(int idFullName) {
        this.idFullName = idFullName;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

}
