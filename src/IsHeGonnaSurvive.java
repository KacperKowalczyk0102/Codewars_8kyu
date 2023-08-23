class IsHeGonnaSurvive {
    public static boolean hero(int bullets, int dragons) {
        int bulletsNeed = dragons * 2;
        if (bullets >= bulletsNeed) {
            return true;
        } else {
            return false; }
    }
}