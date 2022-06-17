public class Snake {
    int paws = 0;
    String tail = "Есть";
    String voice = "Шипит";

    String getInfo(){
        return "Лап " + paws + " хвост " + tail + " " + voice;
    }

    public Snake(int paws, String tail, String voice) {
        this.paws = paws;
        this.tail = tail;
        this.voice = voice;
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
