public enum Month {
    JANUARY("Январь",31),
    FEBRUARY("Февраль", 28),
    MARCH("Март", 31),
    APRIL("Апрель", 30),
    MAY("Май", 31),
    JUNE("Июнь", 30),
    JULY("Июль", 31),
    AUGUST("Август", 31),
    SEPTEMBER("Сентябрь", 30),
    OCTOBER("Октябрь", 31),
    NOVEMBER("Ноябрь", 30),
    DECEMBER("Декабрь", 31);




    private String ruStr;
    private int daysCount;




    Month(String ruStr, int daysCount) {
        this.ruStr = ruStr;
        this.daysCount = daysCount;

    }
}
