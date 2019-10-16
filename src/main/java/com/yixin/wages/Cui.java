package com.yixin.wages;

/**
 * @Package: com.yixin.wages
 * @ClassName: Cui
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/10/16 13:44
 */
public class Cui {
    static class Wages {
        private static final int wages = 7000;
        private static final double social = 517.5;
        private static final double tax = 60;
        private static final int fund = 329;
        private int wokingDay;
        private int leave;
        private double money;
        public Wages(int wokingDay, int leave) {
            this.wokingDay = wokingDay;
            this.leave = leave;
        }
        public double money() {
            return money = wages / wokingDay * (wokingDay - leave) - social - fund - tax;
        }
    }
    public static void main(String[] args) {
        Wages wages = new Wages(20, 1);
        System.out.println("您的到手工资为:  " + wages.money() + "元");
    }

}
