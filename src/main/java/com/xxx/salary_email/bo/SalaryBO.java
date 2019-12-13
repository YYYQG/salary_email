package com.xxx.salary_email.bo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;



@ExcelTarget(value = "工资明细")
@Data
public class SalaryBO {

    @Excel(name = "编号")
    private int id;

    @Excel(name = "部门")
    private String department;

    @Excel(name = "姓　名")
    private String name;

    @Excel(name = "工资标准")
    private double payScale;

    @Excel(name = "基本工资")
    private double baseSalary;

    @Excel(name = "岗位工资")
    private double postSalary;

    @Excel(name = "工龄工资")
    private double senioritySalary;

    @Excel(name = "餐补")
    private double mealAllowance;

    @Excel(name = "其他")
    private double other;

    @Excel(name = "应发小计")
    private double sendSubtotal;

    @Excel(name = "养老")
    private double annuity;

    @Excel(name = "医疗")
    private double medicare;

    @Excel(name = "失业")
    private double  unemploymentInsurance;

    @Excel(name = "公积金")
    private double providentFund;

    @Excel(name = "社保公积金小计")
    private double socialFundSubtotal;

    @Excel(name = "应补税额")
    private double fillTax;

    @Excel(name = "实发数")
    private double takeHomeSalary;

}
