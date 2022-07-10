public enum DayOfWeek {

    MONDAY("Понедельник", "Mon"),
    TUESDAY("Вторник", "Tue"),
    WEDNESDAY("Среда", "Wen"),
    THURSDAY("Четверг", "Th"),
    FRIDAY("Пятница", "Fri"),
    SATURDAY("Суббота", "Sat"),
    SUNDAY("Воскресенье", "Sun");

    DayOfWeek(String ruStr, String shortName) {
        this.ruStr = ruStr;
        this.shortName = shortName;
    }

    private String ruStr;
    private String shortName;


}
