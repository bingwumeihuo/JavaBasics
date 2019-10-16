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
        Wages wages = new Wages(19, 0, 8);
        System.out.println("您的到手工资为:  " + wages.money() + "元");
    }
    static class Wages {
        private static final int wages = 7000;
        private static final double social = 517.5;
        private static final double tax = 60;
        private static final int fund = 329;
        private int wokingDay;
        private int leave;
        private int hours;
        private double money;

        public Wages(int wokingDay, int leave, int hours) {
            this.wokingDay = wokingDay;
            this.leave = leave;
            this.hours = hours;
        }
        public double money() {
            double dayMoney = wages / wokingDay;
            double hoursMoney=dayMoney/8*1.5;
            int Day = wokingDay - leave;
            double other = social + fund + tax;
            money = dayMoney * Day  + (hoursMoney * hours)- other;
            return money;
        }
    }

}
