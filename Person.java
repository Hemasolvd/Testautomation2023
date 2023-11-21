public class Person {
    private String fname;
    private String lname;
    private String mobile;

    public Person(String fname, String lname, String mobile) {
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
    }
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
    public String getMobile() {
        return mobile;
    }
}
