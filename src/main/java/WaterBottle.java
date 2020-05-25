
public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume=volume;
}

    public int getVolume(){
    return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void drink(){
        int beforeDrink = this.getVolume();
        int afterDrink = beforeDrink - 10;
        this.setVolume(afterDrink);
    }
    public void empty(){
        this.setVolume(0);
    }
}
