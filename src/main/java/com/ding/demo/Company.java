package com.ding.demo;

/**
 * Created  by DHui on 2021/10/10.
 */
public class Company {
    private static final int data = 12323;
    private static Staff staff = new Staff();

    public int shangban(){
        int a = 1;
        int b = 2;
        int c = (a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.shangban();
        System.out.println("----------test----------");
    }
}
