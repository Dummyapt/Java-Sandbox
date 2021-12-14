package de.dummyapt.java_sandbox.codewars;

final class Alarm {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(true, false));
    }

    /**
     * Write a function named setAlarm which receives two parameters.
     * The first parameter, employed, is true whenever you are employed
     * and the second parameter, vacation is true whenever you are on
     * vacation.
     * <p>
     * The function should return true if you are employed and not on
     * vacation (because these are the circumstances under which you need
     * to set an alarm). It should return false otherwise.
     *
     * @param employed Whether you are employed
     * @param vacation Whether you are on vacation
     * @return -
     */
    private static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}