package com.yixin.eum;

public class Test {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.getSeasonDesc());
        String s=Season.SPRING.toString();
        System.out.println(s);
    }
}
class Season{
    /**
     声明对象属性
     *
     */
    private final String seasonName;
    private final String seasonDesc;

    /**
     *  私有化构造器，并给对象赋值
     * @param seasonName
     * @param seasonDesc
     */
    public Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    /**
     *
     */
    public static final Season SPRING=new Season("春天","春意盎然");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","白雪皑皑");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
