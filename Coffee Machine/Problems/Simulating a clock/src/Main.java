class Clock {
    int hours = 12;
    int minutes = 0;

   /* public static void main(String[] args) {
        Clock clock = new Clock();
        for (int i = 1; i <= 730; i++) {
            clock.next();
        }
    }
    */

    void next() {
        for (int i = this.hours; i <= 12; i++) {
            for (int k = this.minutes; k <= 59; k++) {
                if (i == 12 && k == 59) {
                    i = 1;
                    this.hours = 1;
                    k = 0;
                    this.minutes = 0;
                    //System.out.println(hours + ":" + minutes);
                    i = 13;
                    break;
                } else if (k == 59) {
                    this.hours = i + 1;
                    this.minutes = 0;
                    //System.out.println(hours + ":" + minutes);
                    i = 13;
                    break;
                }else {
                    this.hours = i;
                    this.minutes = k + 1;
                    //System.out.println(hours + ":" + minutes);
                    i = 13;
                    break;
                }
            }
        }
    }
}
