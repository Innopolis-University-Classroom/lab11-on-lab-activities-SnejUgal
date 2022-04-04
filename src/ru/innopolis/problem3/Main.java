package ru.innopolis.problem3;

public class Main {
    public static void main(String[] args) {
        DevicePlayer player = new DevicePlayer();
        Mp3 audio = new Mp3();
        player.playMp4(new Mp3ToMp4(audio));
    }
}
