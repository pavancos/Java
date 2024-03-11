package Packages.employee;

public class Emp {
    String name, empid, category;
    int bpay, npay;
    double hra, da, pf, grosspay, incometax, allowance;

    public Emp(String n, String id, String c, int b) {
        name = n;
        empid = id;
        category = c;
        bpay = b;
    }

    public void Calculate() {

        da = bpay * 0.05;
        hra = bpay * 0.09;
        pf = bpay * 0.11;
        allowance = bpay * 0.10;
        grosspay = bpay + da + hra + allowance - pf;
        incometax = 0.75 * grosspay;
        npay = (int) (grosspay - incometax);
    }

    public void PrintInfo() {
        System.out.println(" Employee Details");
        System.out.println(" Name:" + name);
        System.out.println(" Employee id:" + empid);
        System.out.println(" Category:" + category);
        System.out.println(" bpay:" + bpay);
        System.out.println(" da:" + da);
        System.out.println(" hra:" + hra);
        System.out.println(" pf:" + pf);
        System.out.println(" all:" + allowance);
        System.out.println(" gs:" + grosspay);
        System.out.println(" Incometax:" + incometax);
        System.out.println(" npay:" + npay);
    }
}
