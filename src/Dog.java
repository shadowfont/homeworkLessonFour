public class Dog {
    int paws = 4;
    String tail = "Есть";
    String voice = "Гав";

    public Dog(int paws, String tail, String voice) {
        this.paws = paws;
        this.tail = tail;
        this.voice = voice;
    }

    String getInfo(){
        return paws + " лапы " + "хвост " + tail + " говорит " + voice;
    }


    public int getPaws() {
        return paws;
    }

    public String getTail() {
        return tail;
    }

    public String getVoice() {
        return voice;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
