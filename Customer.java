class  Customer extends Person {
    private String orderno;
    private double payment;

    public Customer(String fname,String lname, String mobile, String orderno,double payment)
    {
        super(fname,lname,mobile);
        this.orderno = orderno;
        this.payment = payment;
    }
    public String getOrderno()
    {
        return orderno;
    }
    public double getPayment()
    {
        return payment;
    }


    public  void displaycust()
    {
        System.out.println("   Customer details  ");
        System.out.println(" First name::::" +getFname()+ "");
        System.out.println("Lastname::" +getLname()+  "");
        System.out.println("Mobile::" +getMobile()+ "");
        System.out.println("order no:::" +getOrderno()+ "");
        System.out.println("payment :: " +getPayment()+ "");

    }}