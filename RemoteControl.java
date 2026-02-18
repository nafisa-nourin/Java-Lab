//03-02-26 Interface remote control

interface RemoteControl {
    void powerOn();
    void powerOff();
    void volumeUp();
}

class Television implements RemoteControl {
    public void powerOn() {
        System.out.println("TV is ON");
    }
    public void powerOff() {
        System.out.println("TV is OFF");
    }
    public void volumeUp() {
        System.out.println("TV volume increased");
    }
}

class AudioSystem implements RemoteControl {
    public void powerOn() {
        System.out.println("Audio system ON");
    }
    public void powerOff() {
        System.out.println("Audio system OFF");
    }
    public void volumeUp() {
        System.out.println("Audio volume increased");
    }
}

class Main {
    public static void main(String[] args) {
        RemoteControl r;

        r = new Television();
        r.powerOn();

        r = new AudioSystem();
        r.powerOn();
    }
}

