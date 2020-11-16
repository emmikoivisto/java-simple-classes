public class WaterBottle {
    public int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int removeDrink(int newDrink) {
        this.volume -= newDrink;
        return this.volume;
    }

    public int clearVolume() {
        return this.volume = 0;
    }

    public int fillVolume() {
        if (this.volume <= 100) {
            return this.volume = 100;
        } else {
            return this.volume;
        }
    }
}
