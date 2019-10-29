package com.yixin.wages;

/**
 * @Package: com.yixin.wages
 * @ClassName: Cui
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/16 13:44
 */

public class Cui {
    public static void main(String[] args) {
        Wages wages = new Wages(19, 0, 13);
        System.out.println("您的到手工资为:  " + wages.money() + "元");
        System.out.println("其中加班时间为:  " + wages.getHours() + "小时   加班工资为: " + wages.getOverTime());
    }

    static class Wages {
        private static final int WAGES = 7000;
        private static final double SOCIAL = 517.5;
        private static final double TAX = 60;
        private static final int FUND = 329;
        private int wakingDay;
        private int leave;
        public int hours;
        private double overTime;

        Wages(int wakingDay, int leave, int hours) {
            this.wakingDay = wakingDay;
            this.leave = leave;
            this.hours = hours;
        }

        int getHours() {
            return hours;
        }

        double getOverTime() {
            return overTime;
        }

        double money() {
            double dayMoney = WAGES / wakingDay;
            double hoursMoney = dayMoney / 8 * 1.5;
            overTime = hoursMoney * hours;
            int day = wakingDay - leave;
            double other = SOCIAL + FUND + TAX;
            return dayMoney * day + overTime - other;
        }
    }

}
