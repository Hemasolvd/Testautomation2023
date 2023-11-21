class  Employee extends Person {
    private String jobtitle;
    private double salary;

    public Employee(String fname,String lname, String mobile, String jobtitle,double salary)
    {
        super(fname,lname,mobile);
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    public String getJobtitle()
    {
        return jobtitle;
    }
    public double getSalary()
    {
        return salary;
    }


    public  void displayemp()
    {
        System.out.println("   Employee details  ");
        System.out.println(" First name::::" +getFname()+ "");
        System.out.println("Lastname::" +getLname()+  "");
        System.out.println("Mobile::" +getMobile()+ "");
        System.out.println("Title:::" +getJobtitle()+ "");
        System.out.println("salary :: " +getSalary()+ "");

    }}