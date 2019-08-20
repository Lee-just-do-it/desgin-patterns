package com.desgin.patterns.mode.flyweight.example;

/**
 * @author 木子Lee
 * @desc 享元模式
 * @date 2019/8/19 22：29
 * @since 1.0
 */
public class FinancialReportManager implements IReprotManager {

    protected String tenantid = null;

    public FinancialReportManager(String tenantid) {
        this.tenantid = tenantid;
    }

    @Override
    public String createReport() {
        return "FinancialReportManager";
    }
}
