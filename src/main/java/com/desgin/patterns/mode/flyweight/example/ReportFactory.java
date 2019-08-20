package com.desgin.patterns.mode.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 木子Lee
 * @desc 享元模式
 * @date 2019/8/19 22：29
 * @since 1.0
 */
public class ReportFactory {

    Map<String, IReprotManager> f = new HashMap<>();
    Map<String, IReprotManager> e = new HashMap<>();

    public IReprotManager getFinanciaReprotManager(String tenantid) {
        IReprotManager r = f.get(tenantid);
        if (r == null) {
            r = new FinancialReportManager(tenantid);
            f.put(tenantid, r);
        }
        return r;
    }

    public IReprotManager getEmployeeReprotManager(String tenantid) {
        IReprotManager r = e.get(tenantid);
        if (r == null) {
            r = new EmployeeReportManager(tenantid);
            e.put(tenantid, r);
        }
        return r;
    }

    public static void main(String[] args) {
        ReportFactory factory = new ReportFactory();
        IReprotManager r = factory.getFinanciaReprotManager("123");
        IReprotManager r1 = factory.getFinanciaReprotManager("123");
        System.out.println(r.createReport());
        System.out.println(r == r1);
    }

}
