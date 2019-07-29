class LoanDetails
{

    private int term;
    private double rate;
    private double principal;

    public LoanDetails() {
        term = 180;
        rate = .0265;
        principal = 0;
    }

    public LoanDetails(int t, double r, double p){
        term = t;
        rate = r;
        principal = p;
    }

    public void setPrincipal(double p){
        principal = p;
    }

    public double monthlyPayment() {
        return (rate * principal / 12) / (1.0 - Math.pow(((rate/12)+1.0), (-term)));
    }

    public static void main(String[] args){
        LoanDetails ld = new LoanDetails();
        ld.setPrincipal(150000);
        System.out.println("Payment 1 : " + ld.monthlyPayment());
        LoanDetails ld2 = new LoanDetails(10, .025, 125000);
        System.out.println("Payment 2 : "+ ld2.monthlyPayment());
    }

}

